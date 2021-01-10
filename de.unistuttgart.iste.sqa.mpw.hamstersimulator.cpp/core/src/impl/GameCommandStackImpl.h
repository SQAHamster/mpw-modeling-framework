#ifndef DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H
#define DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H

#include "GameCommandStack.h"
#include "Semaphore.h"

namespace commands {

class GameCommandStackImpl: public GameCommandStack {
private:
	using inherited = GameCommandStack;

public:

	GameCommandStackImpl();

	void execute(std::shared_ptr<commands::Command> command) override;

	void undo() override;

	void redo() override;

	void undoAll() override;

	void redoAll() override;

};

}

#endif //DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H
