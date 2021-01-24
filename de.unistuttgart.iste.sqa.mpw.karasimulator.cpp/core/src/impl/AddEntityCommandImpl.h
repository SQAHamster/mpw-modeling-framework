#ifndef DE_UNISTUTTGART_KARA_ADDENTITYCOMMANDIMPL_H
#define DE_UNISTUTTGART_KARA_ADDENTITYCOMMANDIMPL_H

#include "AddEntityCommand.h"

namespace commands {

class AddEntityCommandImpl: public AddEntityCommand {
private:
	using inherited = AddEntityCommand;

public:

	AddEntityCommandImpl();

	void execute() override;

	void undo() override;

	void redo() override;

};

}

#endif //DE_UNISTUTTGART_KARA_ADDENTITYCOMMANDIMPL_H
