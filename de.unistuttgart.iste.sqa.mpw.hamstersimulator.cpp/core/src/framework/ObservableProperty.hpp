
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPROPERTY_H

#include <vector>
#include <functional>

namespace framework {

template<typename T>
class ObservableProperty {

protected:

    std::vector<std::function<void(const T &, const T &)> > listeners;

    void notifyChanged(const T &oldValue, const T &newValue) const {
        for (auto &l : listeners) {
            l(oldValue, newValue);
        }
    }

public:

    virtual const T& get() const = 0;

    void addListener(std::function<void(const T &, const T &)> listener) {
        listeners.push_back(listener);
    }

    void removeListener(std::function<void(const T &, const T &)> listener) {
        listeners.erase(listener);
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPROPERTY_H
