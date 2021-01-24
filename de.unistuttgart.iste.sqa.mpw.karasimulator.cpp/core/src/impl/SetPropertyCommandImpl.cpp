#include "SetPropertyCommandImpl.h"

#include <stdexcept>

namespace commands {

SetPropertyCommandImpl::SetPropertyCommandImpl() {
}

void SetPropertyCommandImpl::execute() {
	throw std::runtime_error("not implemented");
}

void SetPropertyCommandImpl::undo() {
	throw std::runtime_error("not implemented");
}

void SetPropertyCommandImpl::redo() {
	throw std::runtime_error("not implemented");
}

}

