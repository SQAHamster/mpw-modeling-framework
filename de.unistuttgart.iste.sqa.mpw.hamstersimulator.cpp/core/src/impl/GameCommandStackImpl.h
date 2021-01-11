#ifndef DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H
#define DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H

#include "GameCommandStack.h"
#include "Semaphore.h"

#include <thread>

namespace commands {

class GameCommandStackImpl: public GameCommandStack {
private:
	using inherited = GameCommandStack;

public:

	GameCommandStackImpl();

    void startGame() override;
    void startGamePaused() override;

    void execute(std::shared_ptr<commands::Command> command) override;

    void pause() override;
    void resume() override;

    void undo() override;
	void redo() override;
	void undoAll() override;
	void redoAll() override;

private:

    void delay();

    std::thread asyncThread; // used to call aquire in pause async
};

}

#endif //DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H
