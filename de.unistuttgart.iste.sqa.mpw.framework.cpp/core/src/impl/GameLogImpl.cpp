#include "GameLogImpl.h"

#include "LogEntry.h"
#include <stdexcept>

namespace mpw {

GameLogImpl::GameLogImpl() {
}

void GameLogImpl::write(std::shared_ptr<mpw::Actor> actor, std::string message) {
    auto entry = std::make_shared<LogEntry>();
    entry->setActor(actor);
    entry->setMessage(message);
	addToLogEntries(entry);
}

}

