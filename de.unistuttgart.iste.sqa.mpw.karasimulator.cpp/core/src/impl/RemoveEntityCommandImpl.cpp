#include "RemoveEntityCommandImpl.h"

#include <stdexcept>

namespace commands {

RemoveEntityCommandImpl::RemoveEntityCommandImpl() {
}

void RemoveEntityCommandImpl::execute() {
	throw std::runtime_error("not implemented");
}

void RemoveEntityCommandImpl::undo() {
	throw std::runtime_error("not implemented");
}

void RemoveEntityCommandImpl::redo() {
	throw std::runtime_error("not implemented");
}

}

