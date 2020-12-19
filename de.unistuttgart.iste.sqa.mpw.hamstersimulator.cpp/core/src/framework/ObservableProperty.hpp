
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPROPERTY_H

#include <vector>
#include <functional>

namespace framework {

template<typename T>
class ObservableProperty {

private:

  T value {};
  std::vector< std::function<void(const T&, const T&)> > listeners;

public:

  void set(const T& value) {
    T oldValue = this->value;

    if (this->value != value) {
      this->value = value;
      for (auto& l : listeners) {
        l(oldValue, value);
      }
    }
  }

  const T& get() const {
    return this->value;
  }

  void addListener(std::function<void(const T&, const T&)> listener) {
    listeners.push_back(listener);
  }

  void removeListener(std::function<void(const T&, const T&)> listener) {
    listeners.erase(listener);
  }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPROPERTY_H
