#include "GamePerformanceImpl.h"

#include "CommandStack.h"
#include <thread>
#include <stdexcept>

namespace mpw {

GamePerformanceImpl::GamePerformanceImpl()
        : inherited(framework::Semaphore())
{
}

void GamePerformanceImpl::startGame() {
    if (getMode() != Mode::INITIALIZING) {
        throw std::runtime_error("startGame() can only be called in mode INITIALIZING");
    }
    setMode(Mode::RUNNING);
}

void GamePerformanceImpl::startGamePaused() {
    if (getMode() != Mode::INITIALIZING) {
        throw std::runtime_error("startGame() can only be called in mode INITIALIZING");
    }
    pauseGame();
}

void GamePerformanceImpl::pauseGame() {
    if (getMode() != Mode::INITIALIZING && getMode() != Mode::RUNNING) {
        throw std::runtime_error("pause() can only be called in modes INITIALIZING/RUNNING");
    }
    setMode(Mode::PAUSED);
    getSemaphore().acquire();
}

void GamePerformanceImpl::resumeGame() {
    if (getMode() != Mode::PAUSED) {
        throw std::runtime_error("pause() can only be called in mode RUNNING");
    }
    setMode(Mode::RUNNING);
    getSemaphore().release();
}

void GamePerformanceImpl::stopGame() {
    setMode(Mode::STOPPED);
    if (getSemaphore().isLocked()) {
        getSemaphore().release();
    }
}

void GamePerformanceImpl::abortOrStopGame() {
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

void GamePerformanceImpl::hardReset() {
    getGameCommandStack()->clearExecutedCommands();
    getGameCommandStack()->clearUndoneCommands();
    stopGame();
    setMode(Mode::INITIALIZING);
}

void GamePerformanceImpl::preExecuteGameCommand() {
    if (getMode() != Mode::PAUSED && getMode() != Mode::RUNNING) {
        throw std::runtime_error("execute() can only be called in modes PAUSED/RUNNING");
    }

    auto lock = getSemaphore().lock();
}

void GamePerformanceImpl::delayControlFlow() {
    if (getDelayEnabled()) {
        double speed = getSpeed();
        long delayTimeInMillis = static_cast<long>((11.0 - speed) / 5.0 * 400.0);
        std::this_thread::sleep_for(std::chrono::milliseconds(delayTimeInMillis));
    }
}

}

