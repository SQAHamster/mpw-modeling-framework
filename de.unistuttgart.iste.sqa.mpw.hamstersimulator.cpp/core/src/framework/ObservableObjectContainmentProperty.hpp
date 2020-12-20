
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTPROPERTY_H

#include <vector>
#include <functional>
#include "ObservableObjectProperty.hpp"

namespace framework {

template<typename T>
class ObservableObjectContainmentProperty : public ObservableObjectProperty<T> {

private:

    std::shared_ptr<T> element{};

public:

    void set(std::shared_ptr<T> element) {
        std::shared_ptr<T> oldElement = this->element;

        if (this->element != element) {
            this->element = element;
            ObservableProperty<std::shared_ptr<T>>::notifyChanged(oldElement, element);
        }
    }

    const std::shared_ptr<T> &get() const override {
        return this->element;
    }

};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTPROPERTY_H
