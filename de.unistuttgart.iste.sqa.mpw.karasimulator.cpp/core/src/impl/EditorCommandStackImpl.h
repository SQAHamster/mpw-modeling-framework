#ifndef DE_UNISTUTTGART_KARA_EDITORCOMMANDSTACKIMPL_H
#define DE_UNISTUTTGART_KARA_EDITORCOMMANDSTACKIMPL_H

#include "EditorCommandStack.h"

namespace commands {

class EditorCommandStackImpl: public EditorCommandStack {
private:
	using inherited = EditorCommandStack;

public:

	EditorCommandStackImpl();

	void execute(std::shared_ptr<commands::Command> command) override;

	void undo() override;

	void redo() override;

	void undoAll() override;

	void redoAll() override;

};

}

#endif //DE_UNISTUTTGART_KARA_EDITORCOMMANDSTACKIMPL_H
