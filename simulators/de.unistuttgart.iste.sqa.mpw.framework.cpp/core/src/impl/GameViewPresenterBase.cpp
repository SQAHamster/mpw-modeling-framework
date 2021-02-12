#include "GameViewPresenterBase.h"

#include "Stage.h"
#include "GameLog.h"
#include "MpwSemaphore.h"
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

GameViewPresenterBase::GameViewPresenterBase(std::shared_ptr<mpw::MiniProgrammingWorld> miniProgrammingWorld)
    : inherited(Semaphore())
    , miniProgrammingWorld(std::move(miniProgrammingWorld)) {
}

void GameViewPresenterBase::bind() {
    const Size& size = getStageSizeFromConcreteStage();
    GameViewPresenter::getViewModel()->init(size);

    auto lock = getSemaphore().lock();

    auto& tilesProperty = getTilesPropertyFromConcreteStage();

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

void GameViewPresenterBase::onBind()
{
  // can be overridden by subclasses
}

void GameViewPresenterBase::playClicked() {
    miniProgrammingWorld->getPerformance()->resumeGame();
}

void GameViewPresenterBase::pauseClicked() {
    miniProgrammingWorld->getPerformance()->pauseGame();
}

void GameViewPresenterBase::undoClicked() {
    miniProgrammingWorld->getPerformance()->getGameCommandStack()->undo();
}

void GameViewPresenterBase::redoClicked() {
    miniProgrammingWorld->getPerformance()->getGameCommandStack()->redo();
}

void GameViewPresenterBase::close() {
    miniProgrammingWorld->getPerformance()->abortOrStopGame();
}

void GameViewPresenterBase::addTileNode(const mpw::Tile& tile) {
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

void GameViewPresenterBase::removeTileNode(const mpw::Tile& tile) {
    Tile& nonConstTile = const_cast<Tile&>(tile); // TODO const-correctness: adapt after migrate generator
    auto cell = getViewModel()->getCellAt(
            nonConstTile.getLocation().getRow(),
            nonConstTile.getLocation().getColumn());
    cell->clearLayers();
}

void GameViewPresenterBase::setTileNodeAt(const Location& location, const Tile& tile) {
    auto cell = getViewModel()->getCellAt(location.getRow(), location.getColumn());
    cell->clearLayers();

    onSetTileNodeAtForCell(*cell, tile);
}

int GameViewPresenterBase::getRotationForDirection(mpw::Direction direction) {
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

void GameViewPresenterBase::addLogEntry(const LogEntry& entry) {
    auto& nonConstEntry = const_cast<LogEntry&>(entry); // TODO const correctness
    auto viewModelEntry = std::make_shared<ViewModelLogEntry>();
    viewModelEntry->setMessage(nonConstEntry.getMessage());
    viewModelEntry->setColor(getColorForLogEntry(entry));
    getViewModel()->addToLogEntries(viewModelEntry);
}

void GameViewPresenterBase::speedChanged(double speedValue) {
    if (!(speedValue >= 0 && speedValue <= 10)) {
        throw std::runtime_error("Provided speed is not in range [0, 10]");
    }
    miniProgrammingWorld->getPerformance()->setSpeed(speedValue);
}

Color GameViewPresenterBase::getColorForLogEntry(const LogEntry& entry) const {
    return Color::BLACK;
}


}
