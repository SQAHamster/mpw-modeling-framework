#ifndef DE_UNISTUTTGART_HAMSTER_REMOVEENTITYCOMMANDIMPL_H
#define DE_UNISTUTTGART_HAMSTER_REMOVEENTITYCOMMANDIMPL_H

#include "RemoveEntityCommand.h"

namespace commands {

class RemoveEntityCommandImpl: public RemoveEntityCommand {
public:

	RemoveEntityCommandImpl();

	void execute() override;

	void undo() override;

	void redo() override;

};

}

#endif //DE_UNISTUTTGART_HAMSTER_REMOVEENTITYCOMMANDIMPL_H
