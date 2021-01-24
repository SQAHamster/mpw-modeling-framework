#include "EditorCommandStackImpl.h"

#include <stdexcept>

namespace commands {

EditorCommandStackImpl::EditorCommandStackImpl() {
}

void EditorCommandStackImpl::execute(
		std::shared_ptr<commands::Command> command) {
	throw std::runtime_error("not implemented");
}

void EditorCommandStackImpl::undo() {
	throw std::runtime_error("not implemented");
}

void EditorCommandStackImpl::redo() {
	throw std::runtime_error("not implemented");
}

void EditorCommandStackImpl::undoAll() {
	throw std::runtime_error("not implemented");
}

void EditorCommandStackImpl::redoAll() {
	throw std::runtime_error("not implemented");
}

}

