#include "GameLogImpl.h"

#include <stdexcept>

namespace mpw {

GameLogImpl::GameLogImpl() {
}

void GameLogImpl::write(std::shared_ptr<mpw::Actor> actor,
		std::string message) {
	throw std::runtime_error("not implemented");
}

}

