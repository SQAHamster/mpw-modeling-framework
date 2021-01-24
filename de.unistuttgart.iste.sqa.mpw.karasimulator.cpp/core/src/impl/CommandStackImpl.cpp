#include "CommandStackImpl.h"

#include <stdexcept>

namespace commands {

CommandStackImpl::CommandStackImpl() {
}

void CommandStackImpl::execute(std::shared_ptr<commands::Command> command) {
	throw std::runtime_error("not implemented");
}

void CommandStackImpl::undo() {
	throw std::runtime_error("not implemented");
}

void CommandStackImpl::redo() {
	throw std::runtime_error("not implemented");
}

void CommandStackImpl::undoAll() {
	throw std::runtime_error("not implemented");
}

void CommandStackImpl::redoAll() {
	throw std::runtime_error("not implemented");
}

}

