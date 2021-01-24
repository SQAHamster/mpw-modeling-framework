#ifndef DE_UNISTUTTGART_KARA_GAMEVIEWMODELIMPL_H
#define DE_UNISTUTTGART_KARA_GAMEVIEWMODELIMPL_H

#include "ViewModelCell.h"
#include "GameViewModel.h"
#include "Size.h"

namespace viewmodel {

class GameViewModelImpl: public GameViewModel {
private:
	using inherited = GameViewModel;

public:

	GameViewModelImpl();

	std::shared_ptr<viewmodel::ViewModelCell> getCellAt(int row, int column)
			override;

	void init(mpw::Size size) override;

};

}

#endif //DE_UNISTUTTGART_KARA_GAMEVIEWMODELIMPL_H
