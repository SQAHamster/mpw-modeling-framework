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
    setMode(Mode::RUNNING);
}

void GameCommandStackImpl::startGamePaused() {
    pause();
}

void GameCommandStackImpl::execute(std::shared_ptr<commands::Command> command) {
    auto lock = getSemaphore().lock();

    addToStack(command);
    command->execute();
    delay();

    try {
    } catch(...) {
    }

}

void GameCommandStackImpl::delay() {
    double speed = getSpeed();
    if (speed <= 0) {
        return;
    }

    long delayTimeInMillis = static_cast<long>((11.0 - speed) / 5.0 * 400.0);
    std::this_thread::sleep_for(std::chrono::milliseconds(delayTimeInMillis));
}

void GameCommandStackImpl::pause() {
    if (getMode() != Mode::INITIALIZING && getMode() != Mode::RUNNING) {
        throw std::runtime_error("pause() can only be called in modes INITIALIZING/RUNNING");
    }
    setMode(Mode::PAUSED);

    asyncThread = std::thread([&]() {
        getSemaphore().aquire();
    });
}

void GameCommandStackImpl::resume() {
    if (getMode() != Mode::PAUSED) {
        throw std::runtime_error("pause() can only be called in modes INITIALIZING/RUNNING");
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
}

void GameCommandStackImpl::redo() {
    throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::undoAll() {
    while (!getStack().empty()) {
        undo();
    }
}

void GameCommandStackImpl::redoAll() {
    throw std::runtime_error("not implemented");
}

}

