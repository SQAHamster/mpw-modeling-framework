#ifndef DE_UNISTUTTGART_KARA_GAMECOMMANDSTACKIMPL_H
#define DE_UNISTUTTGART_KARA_GAMECOMMANDSTACKIMPL_H

#include "GameCommandStack.h"
#include "Semaphore.h"

namespace commands {

class GameCommandStackImpl: public GameCommandStack {
private:
	using inherited = GameCommandStack;

public:

	GameCommandStackImpl(framework::Semaphore semaphore);

	void execute(std::shared_ptr<commands::Command> command) override;

	void undo() override;

	void redo() override;

	void undoAll() override;

	void redoAll() override;

	void startGame() override;

	void startGamePaused() override;

	void pause() override;

	void resume() override;

};

}

#endif //DE_UNISTUTTGART_KARA_GAMECOMMANDSTACKIMPL_H
