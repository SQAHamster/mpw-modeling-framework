#ifndef DE_UNISTUTTGART_KARA_SETPROPERTYCOMMANDIMPL_H
#define DE_UNISTUTTGART_KARA_SETPROPERTYCOMMANDIMPL_H

#include "SetPropertyCommand.h"

namespace commands {

class SetPropertyCommandImpl: public SetPropertyCommand {
private:
	using inherited = SetPropertyCommand;

public:

	SetPropertyCommandImpl();

	void execute() override;

	void undo() override;

	void redo() override;

};

}

#endif //DE_UNISTUTTGART_KARA_SETPROPERTYCOMMANDIMPL_H
