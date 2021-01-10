#include "EditorCommandStackImpl.h"

#include "Command.h"
#include <stdexcept>

namespace commands {

EditorCommandStackImpl::EditorCommandStackImpl() {
}

void EditorCommandStackImpl::execute(std::shared_ptr<commands::Command> command) {
    addToStack(command);
    command->execute();
}

void EditorCommandStackImpl::undo() {
    auto stack = getStack();
    if (stack.empty()) {
        throw std::runtime_error("cannot undo with empty stack");
    }

    auto command = stack.back();
    removeFromStack(command);
    command->undo();
}

void EditorCommandStackImpl::redo() {
    throw std::runtime_error("not implemented");
}

void EditorCommandStackImpl::undoAll() {
    while (!getStack().empty()) {
        undo();
    }
}

void EditorCommandStackImpl::redoAll() {
    throw std::runtime_error("not implemented");
}

}

