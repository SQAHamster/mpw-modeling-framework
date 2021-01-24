#ifndef DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H
#define DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H

#include "GameCommandStack.h"
#include "Semaphore.h"

#include <thread>
#include <stack>

namespace commands {

class GameCommandStackImpl: public GameCommandStack {
private:
	using inherited = GameCommandStack;

    std::thread asyncThread; // used to call acquire in pause async
    std::stack<std::shared_ptr<Command>> undoneCommands;
    bool delayEnabled = true;

public:

	GameCommandStackImpl();

    void startGame() override;
    void startGamePaused() override;

    void execute(std::shared_ptr<commands::Command> command) override;

    void pauseGame() override;
    void resumeGame() override;

    void stopGame() override;

    void reset() override;

    void hardReset() override;

    void abortOrStopGame() override;

    void enableDelay() override;

    void disableDelay() override;

    void undo() override;
	void redo() override;
	void undoAll() override;
	void redoAll() override;

private:

    void delay();
};

}

#endif //DE_UNISTUTTGART_HAMSTER_GAMECOMMANDSTACKIMPL_H
