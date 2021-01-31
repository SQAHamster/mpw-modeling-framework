#include "GameViewPresenterImpl.h"

#include "Stage.h"
#include "GameLog.h"
#include "Semaphore.h"
#include "CommandStack.h"
#include "GamePerformance.h"

#include "ViewModelLogEntry.h"

#include "CollectionHelpers.hpp"
#include <stdexcept>
#include <utility>

using namespace mpw;
using namespace collectionhelpers;
using namespace framework;

namespace viewmodel {

// TODO remove listeners on removement of relating objects

GameViewPresenterImpl::GameViewPresenterImpl(std::shared_ptr<mpw::MiniProgrammingWorld> miniProgrammingWorld)
    : inherited(Semaphore())
    , miniProgrammingWorld(std::move(miniProgrammingWorld)) {
    const Size& size = this->miniProgrammingWorld->getStage()->getStageSize();
    GameViewPresenter::getViewModel()->init(size);
}

void GameViewPresenterImpl::bind() {
    auto lock = getSemaphore().lock();

    Stage& territory = *miniProgrammingWorld->getStage();
    auto& tilesProperty = territory.tilesProperty();
    
    tilesProperty.addOnAddedListener([this](auto& tile) { addTileNode(tile); });
    tilesProperty.addOnRemovedListener([this](auto& tile) { removeTileNode(tile); });
    tilesProperty.forEach([this](auto& tile) { addTileNode(tile); });

    auto miniProgrammingWorldLog = miniProgrammingWorld->getGameLog();
    miniProgrammingWorldLog->logEntriesProperty().addOnAddedListener([this](const LogEntry& entry) {
        auto lock = getSemaphore().lock();
        addLogEntry(entry);
    });
    miniProgrammingWorldLog->logEntriesProperty().forEach([this](const LogEntry& entry) {
        addLogEntry(entry);
    });

    onBind();
}

void GameViewPresenterImpl::onBind()
{
  // can be overridden by subclasses
}

void GameViewPresenterImpl::playClicked() {
    miniProgrammingWorld->getPerformance()->resumeGame();
}

void GameViewPresenterImpl::pauseClicked() {
    miniProgrammingWorld->getPerformance()->pauseGame();
}

void GameViewPresenterImpl::undoClicked() {
    miniProgrammingWorld->getPerformance()->getGameCommandStack()->undo();
}

void GameViewPresenterImpl::redoClicked() {
    miniProgrammingWorld->getPerformance()->getGameCommandStack()->redo();
}

void GameViewPresenterImpl::close() {
    miniProgrammingWorld->getPerformance()->abortOrStopGame();
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

    onSetTileNodeAtForCell(*cell, tile);
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

void GameViewPresenterImpl::addLogEntry(const LogEntry& entry) {
    auto& nonConstEntry = const_cast<LogEntry&>(entry); // TODO const correctness
    auto viewModelEntry = std::make_shared<ViewModelLogEntry>();
    viewModelEntry->setMessage(nonConstEntry.getMessage());
    viewModelEntry->setColor(Color::BLACK);
    getViewModel()->addToLogEntries(viewModelEntry);
}

void GameViewPresenterImpl::speedChanged(double speedValue) {
    if (!(speedValue >= 0 && speedValue <= 10)) {
        throw std::runtime_error("Provided speed is not in range [0, 10]");
    }
    miniProgrammingWorld->getPerformance()->setSpeed(speedValue);
}


}
