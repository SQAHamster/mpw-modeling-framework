
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVEPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVEPROPERTY_H

#include <vector>
#include <functional>

namespace framework {

template<typename T>
class ObservablePrimitiveProperty {

private:

    T value{};

    std::vector<std::function<void(const T &, const T &)> > listeners;

    void notifyChanged(const T &oldValue, const T &newValue) const {
        for (auto &l : listeners) {
            l(oldValue, newValue);
        }
    }

public:

    void set(const T &value) {
        T oldValue = this->value;

        if (this->value != value) {
            this->value = value;
            notifyChanged(oldValue, value);
        }
    }

    const T &get() const {
        return this->value;
    }

    void addListener(std::function<void(const T &, const T &)> listener) {
        listeners.push_back(listener);
    }

    void removeListener(std::function<void(const T &, const T &)> listener) {
        listeners.erase(listener);
    }

};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVEPROPERTY_H
