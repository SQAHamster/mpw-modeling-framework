#include "GameViewModelImpl.h"

#include <stdexcept>

namespace viewmodel {

GameViewModelImpl::GameViewModelImpl() {
}

std::shared_ptr<viewmodel::ViewModelCell> GameViewModelImpl::getCellAt(int row,
		int column) {
	throw std::runtime_error("not implemented");
}

void GameViewModelImpl::init(mpw::Size size) {
	throw std::runtime_error("not implemented");
}

}

