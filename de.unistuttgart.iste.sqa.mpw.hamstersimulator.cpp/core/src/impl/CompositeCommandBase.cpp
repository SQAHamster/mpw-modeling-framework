#include "CompositeCommandBase.h"

#include "AddEntityCommandImpl.h"
#include "RemoveEntityCommandImpl.h"

namespace commands {
  void CompositeCommandBase::undo() {
    auto subCommands = getSubCommands();
    for (auto iter = subCommands.rbegin(); iter != subCommands.rend(); ++iter) {
      auto& subCommand = *iter;
      subCommand->undo();
    }
  }

  void CompositeCommandBase::redo() {
    auto subCommands = getSubCommands();
    for (auto& subCommand : subCommands) {
      subCommand->redo();
    }
  }

  void CompositeCommandBase::executeSetProperty(std::shared_ptr<Entity> entity, std::string propertyName, Any oldValue, Any newValue) {
    internalExecuteSetProperty(entity, propertyName, oldValue, newValue);
  }

  SetPropertyCommandImpl& CompositeCommandBase::internalExecuteSetProperty(std::shared_ptr<Entity> entity, std::string propertyName, Any oldValue, Any newValue) {
    auto command = std::make_shared<SetPropertyCommandImpl>();
    command->setEntity(entity);
    command->setOldValue(oldValue);
    command->setNewValue(newValue);
    command->setPropertyName(propertyName);

    addToSubCommands(command);
    command->execute();
    return *command;
  }

  void CompositeCommandBase::executeAddReference(std::shared_ptr<Entity> entity, std::string propertyName, std::shared_ptr<Entity> entityToAdd) {
    auto command = std::make_shared<AddEntityCommandImpl>();
    command->setEntity(entity);
    command->setEntityToAdd(entityToAdd);
    command->setPropertyName(propertyName);

    addToSubCommands(command);
    command->execute();
  }

  void CompositeCommandBase::executeRemoveReference(std::shared_ptr<Entity> entity, std::string propertyName, std::shared_ptr<Entity> entityToRemove) {
    auto command = std::make_shared<RemoveEntityCommandImpl>();
    command->setEntity(entity);
    command->setEntityToRemove(entityToRemove);
    command->setPropertyName(propertyName);

    addToSubCommands(command);
    command->execute();
  }

}
