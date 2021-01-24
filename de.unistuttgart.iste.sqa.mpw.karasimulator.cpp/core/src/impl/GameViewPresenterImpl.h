#ifndef DE_UNISTUTTGART_KARA_GAMEVIEWPRESENTERIMPL_H
#define DE_UNISTUTTGART_KARA_GAMEVIEWPRESENTERIMPL_H

#include "GameViewModel.h"
#include "GameViewPresenter.h"
#include "Semaphore.h"

namespace viewmodel {

class GameViewPresenterImpl: public GameViewPresenter {
private:
	using inherited = GameViewPresenter;

public:

	GameViewPresenterImpl(framework::Semaphore semaphore);

	void playClicked() override;

	void pauseClicked() override;

	void undoClicked() override;

	void redoClicked() override;

	void textTyped(std::string text) override;

	std::shared_ptr<viewmodel::GameViewModel> getViewModel() override;

	void bind() override;

};

}

#endif //DE_UNISTUTTGART_KARA_GAMEVIEWPRESENTERIMPL_H
