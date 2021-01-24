#ifndef DE_UNISTUTTGART_KARA_GAMELOGIMPL_H
#define DE_UNISTUTTGART_KARA_GAMELOGIMPL_H

#include "GameLog.h"
#include "Actor.h"

namespace mpw {

class GameLogImpl: public GameLog {
private:
	using inherited = GameLog;

public:

	GameLogImpl();

	void write(std::shared_ptr<mpw::Actor> actor, std::string message) override;

};

}

#endif //DE_UNISTUTTGART_KARA_GAMELOGIMPL_H
