
#ifndef DE_UNISTUTTGART_HAMSTER_COMPOSITECOMMANDBASE_H
#define DE_UNISTUTTGART_HAMSTER_COMPOSITECOMMANDBASE_H

#include <memory>
#include <string>

#include "Any.h"
#include "CompositeCommand.h"
#include "Entity.h"

namespace commands {
  class CompositeCommandBase : public CompositeCommand {
  public:

    void undo() override;
    void redo() override;

  protected:

    void executeSetProperty(std::shared_ptr<Entity> entity, std::string propertyName, Any oldValue, Any newValue);
    void executeAddReference(std::shared_ptr<Entity> entity, std::string propertyName, std::shared_ptr<Entity> entityToAdd);
    void executeRemoveReference(std::shared_ptr<Entity> entity, std::string propertyName, std::shared_ptr<Entity> entityToRemove);
  };
}

#endif //DE_UNISTUTTGART_HAMSTER_COMPOSITECOMMANDBASE_H

