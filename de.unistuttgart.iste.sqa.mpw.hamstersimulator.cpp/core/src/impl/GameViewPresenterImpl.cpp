#include "GameViewPresenterImpl.h"

#include "Territory.h"
#include "GameTerritory.h"
#include "GameLog.h"
#include "Semaphore.h"
#include "GameCommandStack.h"

#include "ViewModelCellLayer.h"

#include "CollectionHelpers.hpp"
#include <stdexcept>
#include <utility>

using namespace mpw;
using namespace hamster;
using namespace collectionhelpers;
using namespace framework;

namespace hamsterviewmodel {

// TODO remove listeners on removement of relating objects

GameViewPresenterImpl::GameViewPresenterImpl(std::shared_ptr<hamster::HamsterGame> game)
    : inherited(Semaphore())
    , game(std::move(game)) {
    const Size& size = this->game->getTerritory()->getTerritorySize();
    getViewModel()->init(size);
}

void GameViewPresenterImpl::bind() {
    auto lock = getSemaphore().lock();

    ReadOnlyTerritory& territory = *game->getTerritory()->getInternalTerritory();
    auto& tilesProperty = territory.tilesProperty();
    
    tilesProperty.addOnAddedListener([this](auto& tile) { addTileNode(tile); });
    tilesProperty.addOnRemovedListener([this](auto& tile) { removeTileNode(tile); });
    tilesProperty.forEach([this](auto& tile) { addTileNode(tile); });

    auto gameLog = game->getGameLog();
    gameLog->logEntriesProperty().addOnAddedListener([this](const std::string& entry) {
        auto lock = getSemaphore().lock();
        addLogEntry(entry);
    });
    gameLog->logEntriesProperty().forEach([this](const std::string& entry) {
        addLogEntry(entry);
    });
}

void GameViewPresenterImpl::playClicked() {
    game->getGameCommandStack()->resume();
}

void GameViewPresenterImpl::pauseClicked() {
    game->getGameCommandStack()->pause();
}

void GameViewPresenterImpl::undoClicked() {
    game->getGameCommandStack()->undo();
}

void GameViewPresenterImpl::redoClicked() {
    game->getGameCommandStack()->redo();
}

void GameViewPresenterImpl::textTyped(std::string text) {
    throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::addTileNode(const mpw::Tile& tile) {
    Tile& nonConstTile = const_cast<Tile&>(tile); // TODO const-correctness: adapt after migrate generator
    const Location& location = nonConstTile.getLocation();

    auto& contentsProperty = nonConstTile.contentsProperty();
    addedContentListenerIds[&tile] = contentsProperty.addOnAddedListener([this, &nonConstTile](const mpw::TileContent&) {
        auto lock = getSemaphore().lock();
        setTileNodeAt(nonConstTile.getLocation(), nonConstTile);
    });
    removedContentListenerIds[&tile] = contentsProperty.addOnRemovedListener([this, &nonConstTile](const mpw::TileContent&) {
        auto lock = getSemaphore().lock();
        setTileNodeAt(nonConstTile.getLocation(), nonConstTile);
    });
    setTileNodeAt(location, tile);
}

void GameViewPresenterImpl::removeTileNode(const mpw::Tile& tile) {
    Tile& nonConstTile = const_cast<Tile&>(tile); // TODO const-correctness: adapt after migrate generator
    auto cell = getViewModel()->getCellAt(
            nonConstTile.getLocation().getRow(),
            nonConstTile.getLocation().getColumn());
    cell->clearLayers();
}

void GameViewPresenterImpl::setTileNodeAt(const Location& location, const Tile& tile) {
    auto cell = getViewModel()->getCellAt(location.getRow(), location.getColumn());
    cell->clearLayers();

    configureWallImageView(*cell, tile);
    configureGrainImageView(*cell, tile);
    for (std::shared_ptr<ReadOnlyHamster> hamster : getHamstersOfTile(tile)) {
        configureHamsterImageView(*cell, *hamster);
    }

}

void GameViewPresenterImpl::configureGrainImageView(ViewModelCell& cell, const Tile& tile) {
    Tile& nonConstTile = const_cast<Tile&>(tile); // TODO const-correctness: adapt after migrate generator
    auto grainLayer = std::make_shared<ViewModelCellLayer>();
    refreshGrainLayer(*grainLayer, tile);

    cell.addToLayers(grainLayer);
}

void GameViewPresenterImpl::refreshGrainLayer(ViewModelCellLayer& layer, const mpw::Tile& tile) {
    size_t grainCount = getGrainOfTile(tile).size();
    layer.setVisible(grainCount > 0);
    if (grainCount <= 12) {
        layer.setImageName(std::to_string(grainCount) + "Corn32");
    } else {
        layer.setImageName("12PlusCorn32");
    }
}

void GameViewPresenterImpl::configureWallImageView(ViewModelCell& cell, const Tile& tile) {
    Tile& nonConstTile = const_cast<Tile&>(tile); // TODO const-correctness: adapt after migrate generator
    auto wallLayer = std::make_shared<ViewModelCellLayer>();
    wallLayer->setImageName("Wall32");
    refreshWallLayer(*wallLayer, tile);

    cell.addToLayers(wallLayer);
}

void GameViewPresenterImpl::refreshWallLayer(ViewModelCellLayer& layer, const Tile& tile) {
    layer.setVisible(!getWallsOfTile(tile).empty());
}

void GameViewPresenterImpl::configureHamsterImageView(ViewModelCell& cell, const ReadOnlyHamster& hamster) {
    auto& nonConstHamster = const_cast<ReadOnlyHamster&>(hamster); // TODO const-correctness: adapt after migrate generator
    auto hamsterLayer = std::make_shared<ViewModelCellLayer>();
    hamsterLayer->setImageName("Hamster32");

    changedHamsterDirectionListenerIds[&hamster] = nonConstHamster.directionProperty().addListener([this, &nonConstHamster, hamsterLayer](Direction oldValue, Direction newValue) {
        auto lock = getSemaphore().lock();
        refreshHamsterLayer(*hamsterLayer, nonConstHamster);
    });
    refreshHamsterLayer(*hamsterLayer, nonConstHamster);

    cell.addToLayers(hamsterLayer);
}

void GameViewPresenterImpl::refreshHamsterLayer(ViewModelCellLayer& layer, hamster::ReadOnlyHamster& hamster) {
    layer.setVisible(hamster.getCurrentTile() != nullptr);
    if (hamster.getCurrentTile() == nullptr) {
        return;
    }
    layer.setRotation(getRotationForDirection(hamster.getDirection()));
}

std::list<std::shared_ptr<hamster::ReadOnlyHamster>> GameViewPresenterImpl::getHamstersOfTile(const Tile& tile) {
    return type_select<hamster::ReadOnlyHamster>(const_cast<Tile&>(tile).getContents());
}

std::list<std::shared_ptr<hamster::Wall>> GameViewPresenterImpl::getWallsOfTile(const Tile& tile) {
    return type_select<hamster::Wall>(const_cast<Tile&>(tile).getContents());
}

std::list<std::shared_ptr<hamster::Grain>> GameViewPresenterImpl::getGrainOfTile(const Tile& tile) {
    return type_select<hamster::Grain>(const_cast<Tile&>(tile).getContents());
}

int GameViewPresenterImpl::getRotationForDirection(mpw::Direction direction) {
    switch (direction) {
        case Direction::EAST:
            return 0;
        case Direction::SOUTH:
            return 90;
        case Direction::WEST:
            return 180;
        case Direction::NORTH:
            return 270;
    }
    throw std::runtime_error("Invalid direction!");
}

void GameViewPresenterImpl::addLogEntry(const std::string& entry) {
    getViewModel()->addToLogEntries(entry);
}


}
