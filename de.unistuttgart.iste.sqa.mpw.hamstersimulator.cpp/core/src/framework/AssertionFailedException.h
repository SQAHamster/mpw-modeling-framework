
#ifndef DE_UNISTUTTGART_FRAMEWORK_ASSERTIONFAILEDEXCEPTION_H
#define DE_UNISTUTTGART_FRAMEWORK_ASSERTIONFAILEDEXCEPTION_H

#include <string>
#include <exception>

namespace framework {

class AssertionFailedException : public std::exception {
public:
    AssertionFailedException(std::string message)
  : message(message)
  {
  }

  const char *what() const _NOEXCEPT override {
      return message.c_str();
  }

private:
  std::string message;
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_ASSERTIONFAILEDEXCEPTION_H
