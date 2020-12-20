
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTREFERENCEPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTREFERENCEPROPERTY_H

#include <vector>
#include <functional>
#include "ObservableObjectProperty.hpp"

namespace framework {

template<typename T>
class ObservableObjectReferenceProperty : public ObservableObjectProperty<T> {

private:

    std::weak_ptr<T> element{};

public:

    void set(std::shared_ptr<T> element) {
        std::shared_ptr<T> oldElement = this->element.lock();

        if (this->element.lock() != element) {
            this->element = element;
            ObservableProperty<std::shared_ptr<T>>::notifyChanged(oldElement, element);
        }
    }

    const std::shared_ptr<T>& get() const override {
        return this->element.lock();
    }

};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTREFERENCEPROPERTY_H
