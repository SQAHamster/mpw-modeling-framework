#include "GamePerformanceImpl.h"

#include <stdexcept>

namespace mpw {

GamePerformanceImpl::GamePerformanceImpl(framework::Semaphore semaphore)
: (semaphore)
{
}

void GamePerformanceImpl::startGame() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::startGamePaused() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::pauseGame() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::resumeGame() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::stopGame() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::reset() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::hardReset() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::abortOrStopGame() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::holdControlFlowIfPaused() {
	throw std::runtime_error("not implemented");
}

void GamePerformanceImpl::delayControlFlow() {
	throw std::runtime_error("not implemented");
}

}

