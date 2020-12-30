
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLELISTPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLELISTPROPERTY_H

#include <list>
#include <functional>
#include <memory>

namespace framework {

template<typename T>
class ObservableListProperty {

protected:

    std::vector<std::function<void(const T &)> > addedListeners;
    std::vector<std::function<void(const T &)> > removedListeners;

    void notifyAdded(const T &element) const {
        for (auto &l : addedListeners) {
            l(element);
        }
    }

    void notifyRemoved(const T &element) const {
        for (auto &l : removedListeners) {
            l(element);
        }
    }

public:

    virtual ~ObservableListProperty() = default;

    virtual void forEach(std::function<void(const T &)> consumer) const = 0;

    void addOnAddedListener(std::function<void(const T &)> listener) {
        addedListeners.push_back(listener);
    }

    void removeOnAddedListener(std::function<void(const T &)> listener) {
        addedListeners.erase(listener);
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLELISTPROPERTY_H
