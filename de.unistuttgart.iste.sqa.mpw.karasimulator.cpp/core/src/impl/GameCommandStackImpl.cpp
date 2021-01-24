#include "GameCommandStackImpl.h"

#include <stdexcept>

namespace commands {

GameCommandStackImpl::GameCommandStackImpl(framework::Semaphore semaphore)
: (semaphore)
{
}

void GameCommandStackImpl::execute(std::shared_ptr<commands::Command> command) {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::undo() {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::redo() {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::undoAll() {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::redoAll() {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::startGame() {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::startGamePaused() {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::pause() {
	throw std::runtime_error("not implemented");
}

void GameCommandStackImpl::resume() {
	throw std::runtime_error("not implemented");
}

}

