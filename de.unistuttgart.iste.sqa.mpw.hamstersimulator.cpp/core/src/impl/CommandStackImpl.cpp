#include "CommandStackImpl.h"

#include <stdexcept>

namespace commands {

CommandStackImpl::CommandStackImpl() {
}

void CommandStackImpl::execute(std::shared_ptr<commands::Command> command) {
    addToStack(command);
	command->execute();
}

void CommandStackImpl::undo() {
    auto stack = getStack();
    if (stack.empty()) {
        throw std::runtime_error("cannot undo with empty stack");
    }

    auto command = stack.back();
    removeFromStack(command);
    command->undo();
}

void CommandStackImpl::redo() {
	throw std::runtime_error("not implemented");
}

void CommandStackImpl::undoAll() {
    while (!getStack().empty()) {
        undo();
    }
}

void CommandStackImpl::redoAll() {
	throw std::runtime_error("not implemented");
}

}

