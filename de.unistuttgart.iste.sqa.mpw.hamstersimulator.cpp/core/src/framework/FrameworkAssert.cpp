#include "FrameworkAssert.h"

#include <stdexcept>

namespace framework {
  void assertAttributeCondition(const std::string& condition, bool valid)
  {
    if (!valid) {
      std::string message = "Attribute condition is not valid: " + condition;
      throw std::exception(message.c_str());
    }
  }

  void assertInstanceNotNull(const std::string& instanceName, EntityReference instance)
  {
    if (instance == nullptr) {
      std::string message = "Instance must not be null: " + instanceName;
      throw std::exception(message.c_str());
    }
  }

  void assertObjectFound(const std::string& referenceName, const std::string& objectTypeName,
    EntityReference instance)
  {
    if (instance == nullptr) {
      std::string message = "Object of type '" + objectTypeName + "' for reference '" + referenceName + "' not found";
      throw std::exception(message.c_str());
    }
  }
}
