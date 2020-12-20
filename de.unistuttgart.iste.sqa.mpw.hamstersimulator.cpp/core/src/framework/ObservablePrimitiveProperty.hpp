
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVEPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVEPROPERTY_H

#include <vector>
#include <functional>
#include "ObservableProperty.hpp"

namespace framework {

template<typename T>
class ObservablePrimitiveProperty : public ObservableProperty<T> {

private:

    T value{};

public:

    void set(const T &value) {
        T oldValue = this->value;

        if (this->value != value) {
            this->value = value;
            ObservableProperty<T>::notifyChanged(oldValue, value);
        }
    }

    const T &get() const override {
        return this->value;
    }

};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVEPROPERTY_H
