#include "AddEntityCommandImpl.h"

#include <stdexcept>

namespace commands {

AddEntityCommandImpl::AddEntityCommandImpl() {
}

void AddEntityCommandImpl::execute() {
	throw std::runtime_error("not implemented");
}

void AddEntityCommandImpl::undo() {
	throw std::runtime_error("not implemented");
}

void AddEntityCommandImpl::redo() {
	throw std::runtime_error("not implemented");
}

}

