#ifndef DE_UNISTUTTGART_HAMSTER_SETPROPERTYCOMMANDIMPL_H
#define DE_UNISTUTTGART_HAMSTER_SETPROPERTYCOMMANDIMPL_H

#include "SetPropertyCommand.h"

namespace commands {

class SetPropertyCommandImpl: public SetPropertyCommand {
public:

	SetPropertyCommandImpl();

	void execute() override;

	void undo() override;

	void redo() override;

};

}

#endif //DE_UNISTUTTGART_HAMSTER_SETPROPERTYCOMMANDIMPL_H
