#ifndef DE_UNISTUTTGART_HAMSTER_GAMEVIEWPRESENTERIMPL_H
#define DE_UNISTUTTGART_HAMSTER_GAMEVIEWPRESENTERIMPL_H

#include "GameViewModel.h"
#include "GameViewPresenter.h"

namespace hamsterviewmodel {

class GameViewPresenterImpl: public GameViewPresenter {
private:
	using inherited = GameViewPresenter;

public:

	GameViewPresenterImpl();

	void playClicked() override;

	void stopClicked() override;

	void textTyped(std::string text) override;

	std::shared_ptr<hamsterviewmodel::GameViewModel> getViewModel() noexcept override;

};

}

#endif //DE_UNISTUTTGART_HAMSTER_GAMEVIEWPRESENTERIMPL_H
