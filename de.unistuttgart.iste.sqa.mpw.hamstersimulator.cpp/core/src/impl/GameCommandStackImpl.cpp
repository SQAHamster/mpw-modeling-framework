#include "GameCommandStackImpl.h"

#include "Command.h"
#include <thread>
#include <stdexcept>

namespace commands {

GameCommandStackImpl::GameCommandStackImpl()
: inherited(framework::Semaphore())
{
}

void GameCommandStackImpl::startGame() {
    if (getMode() != Mode::INITIALIZING) {
        throw std::runtime_error("startGame() can only be called in mode INITIALIZING");
    }
    setMode(Mode::RUNNING);
}

void GameCommandStackImpl::startGamePaused() {
    if (getMode() != Mode::INITIALIZING) {
        throw std::runtime_error("startGame() can only be called in mode INITIALIZING");
    }
    pauseGame();
}

void GameCommandStackImpl::execute(std::shared_ptr<commands::Command> command) {
    if (getMode() != Mode::PAUSED && getMode() != Mode::RUNNING) {
        throw std::runtime_error("execute() can only be called in modes PAUSED/RUNNING");
    }

    auto lock = getSemaphore().lock();

    addToStack(command);
    command->execute();
    delay();
}

void GameCommandStackImpl::delay() {
    if (delayEnabled) {
        double speed = getSpeed();
        long delayTimeInMillis = static_cast<long>((11.0 - speed) / 5.0 * 400.0);
        std::this_thread::sleep_for(std::chrono::milliseconds(delayTimeInMillis));
    }
}

void GameCommandStackImpl::pauseGame() {
    if (getMode() != Mode::INITIALIZING && getMode() != Mode::RUNNING) {
        throw std::runtime_error("pause() can only be called in modes INITIALIZING/RUNNING");
    }
    setMode(Mode::PAUSED);
    getSemaphore().acquire();
}

void GameCommandStackImpl::resumeGame() {
    if (getMode() != Mode::PAUSED) {
        throw std::runtime_error("pause() can only be called in mode RUNNING");
    }
    setMode(Mode::RUNNING);
    getSemaphore().release();
}

void GameCommandStackImpl::undo() {
    auto stack = getStack();
    if (stack.empty()) {
        throw std::runtime_error("cannot undo with empty stack");
    }

    auto command = stack.back();
    removeFromStack(command);
    command->undo();
    undoneCommands.push(command);
}

void GameCommandStackImpl::redo() {
    if (undoneCommands.empty()) {
        throw std::runtime_error("cannot redo with no undone commands");
    }
    auto undoneCommand = undoneCommands.top();
    undoneCommands.pop();
    undoneCommand->execute();
    addToStack(undoneCommand);
}

void GameCommandStackImpl::undoAll() {
    while (!getStack().empty()) {
        undo();
    }
}

void GameCommandStackImpl::redoAll() {
    while (!undoneCommands.empty()) {
        redo();
    }
}

void GameCommandStackImpl::stopGame() {
    setMode(Mode::STOPPED);
    if (getSemaphore().isLocked()) {
        getSemaphore().release();
    }
}

void GameCommandStackImpl::abortOrStopGame() {
    Mode mode = getMode();
    if ((mode == Mode::STOPPED) || (mode == Mode::INITIALIZING)) {
        setMode(Mode::STOPPED);
    } else {
        setMode(Mode::ABORTED);
    }
    if (getSemaphore().isLocked()) {
        getSemaphore().release();
    }
}

void GameCommandStackImpl::reset() {
    if (getMode() != Mode::INITIALIZING) {
        throw std::runtime_error("soft reset is not possible during initialization");
    }

    Mode currentMode = getMode();
    if (currentMode == Mode::RUNNING) {
        pauseGame();
    }
    undoAll();
}

void GameCommandStackImpl::hardReset() {
    clearStack();
    undoneCommands = {};
    stopGame();
    setMode(Mode::INITIALIZING);
}

void GameCommandStackImpl::enableDelay() {
    delayEnabled = true;
}

void GameCommandStackImpl::disableDelay() {
    delayEnabled = false;
}

}

