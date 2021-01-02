#include "GameViewPresenterImpl.h"

#include <stdexcept>

namespace hamsterviewmodel {

GameViewPresenterImpl::GameViewPresenterImpl() {
}

void GameViewPresenterImpl::playClicked() {
	throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::stopClicked() {
	throw std::runtime_error("not implemented");
}

void GameViewPresenterImpl::textTyped(std::string text) {
	throw std::runtime_error("not implemented");
}

std::shared_ptr<hamsterviewmodel::GameViewModel> GameViewPresenterImpl::getViewModel() noexcept {
	return inherited::getViewModel();
}

}

