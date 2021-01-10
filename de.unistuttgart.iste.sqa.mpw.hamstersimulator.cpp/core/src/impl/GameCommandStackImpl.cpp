#include "GameCommandStackImpl.h"

#include "Command.h"
#include <stdexcept>

namespace commands {

GameCommandStackImpl::GameCommandStackImpl()
: inherited(framework::Semaphore())
{
}

void GameCommandStackImpl::execute(std::shared_ptr<commands::Command> command) {
    addToStack(command);
    command->execute();
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

