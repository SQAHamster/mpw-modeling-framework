#include "GameViewPresenterImpl.h"

#include <stdexcept>

namespace viewmodel {

GameViewPresenterImpl::GameViewPresenterImpl(framework::Semaphore semaphore)
: (semaphore)
{
}

void GameViewPresenterImpl::playClicked() {
	throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::pauseClicked() {
	throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::undoClicked() {
	throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::redoClicked() {
	throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::textTyped(std::string text) {
	throw std::runtime_error("not implemented");
}

std::shared_ptr<viewmodel::GameViewModel> GameViewPresenterImpl::getViewModel() {
	throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::bind() {
	throw std::runtime_error("not implemented");
}

}

