
#ifndef DE_UNISTUTTGART_HAMSTER_COMPOSITECOMMANDBASE_H
#define DE_UNISTUTTGART_HAMSTER_COMPOSITECOMMANDBASE_H

#include <memory>
#include <string>

#include "Any.h"
#include "CompositeCommand.h"
#include "SetPropertyCommandImpl.h"
#include "Entity.h"

namespace commands {
  class CompositeCommandBase : public CompositeCommand {
  public:

    void undo() override;
    void redo() override;

  protected:

    void executeSetProperty(std::shared_ptr<basetypes::Entity> entity, std::string propertyName, Any oldValue, Any newValue);
    void executeSetProperty(std::shared_ptr<basetypes::Entity> entity, std::string propertyName, std::shared_ptr<basetypes::Entity> oldValue, std::shared_ptr<basetypes::Entity> newValue);

    /// \brief special variant to set a value, which can be used for value-types
    /// \note \param oldValue and \param newValue are created as copied raw pointers of unmanaged memory on the heap
    template<typename T>
    void executeSetValueProperty(std::shared_ptr<basetypes::Entity> entity, std::string propertyName, T oldValue, T newValue) {
        auto& command = internalExecuteSetProperty(entity, propertyName, new T(oldValue), new T(newValue));
        command.handleLifeCycleOfValues([](ValueReference reference) {
            delete reinterpret_cast<T*>(reference);
        });
    }

    template<typename T>
    void executeSetEnumProperty(std::shared_ptr<basetypes::Entity> entity, std::string propertyName, T oldValue, T newValue) {
        internalExecuteSetProperty(entity, propertyName, static_cast<int>(oldValue), static_cast<int>(newValue));
    }

    void executeAddReference(std::shared_ptr<basetypes::Entity> entity, std::string propertyName, std::shared_ptr<basetypes::Entity> entityToAdd);
    void executeRemoveReference(std::shared_ptr<basetypes::Entity> entity, std::string propertyName, std::shared_ptr<basetypes::Entity> entityToRemove);

  private:

    SetPropertyCommandImpl& internalExecuteSetProperty(std::shared_ptr<basetypes::Entity> entity, std::string propertyName, Any oldValue, Any newValue);
  };
}

#endif //DE_UNISTUTTGART_HAMSTER_COMPOSITECOMMANDBASE_H

