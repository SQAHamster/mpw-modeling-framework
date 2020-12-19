
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLELIST_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLELIST_H

#include <list>
#include <functional>

namespace framework {

template<typename T>
class ObservableList {

private:

  std::list<T> elements {};
  std::vector< std::function<void(const T&)> > addedListeners;
  std::vector< std::function<void(const T&)> > removedListeners;

public:

  void add(const T& element) {
    elements.insert(element);

    for (auto& l : addedListeners) {
      l(element);
    }
  }

  void remove(const T& element) {
    auto iter = elements.remove(element);
    elements.erase(iter);

    T copyToAvoidDeletion = element;

    for (auto& l : removedListeners) {
      l(element);
    }
  }

  void addOnAddedListener(std::function<void(const T&)> listener) {
    addedListeners.push_back(listener);
  }

  void removeOnAddedListener(std::function<void(const T&)> listener) {
    addedListeners.erase(listener);
  }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLELIST_H
