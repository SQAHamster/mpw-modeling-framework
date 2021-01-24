#ifndef DE_UNISTUTTGART_KARA_KARAGAMEIMPL_H
#define DE_UNISTUTTGART_KARA_KARAGAMEIMPL_H

#include "KaraGame.h"

namespace kara {

class KaraGameImpl: public KaraGame {
private:
	using inherited = KaraGame;

public:

	KaraGameImpl();

	void startGame() override;

};

}

#endif //DE_UNISTUTTGART_KARA_KARAGAMEIMPL_H
