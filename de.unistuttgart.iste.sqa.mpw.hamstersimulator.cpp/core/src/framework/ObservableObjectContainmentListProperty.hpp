
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTLISTPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTLISTPROPERTY_H

#include <list>
#include <functional>
#include <memory>
#include "ObservableObjectListProperty.hpp"

namespace framework {

template<typename T>
class ObservableObjectContainmentListProperty : public ObservableObjectListProperty<T> {

private:

    std::list<std::shared_ptr<T>> elements{};

public:

    const std::list<std::shared_ptr<T>>& getElements() const {
        return elements;
    }

    void add(std::shared_ptr<T> element) {
        ObservableObjectListProperty<T>::references.push_back(*element);
        elements.push_back(element);
        ObservableListProperty<T>::notifyAdded(*element);
    }

    void remove(std::shared_ptr<T> element) {
        ObservableObjectListProperty<T>::references.remove_if([element](auto& referenceWrapper) {
            return &referenceWrapper.get() == element.get();
        });
        elements.remove(element);
        ObservableListProperty<T>::notifyRemoved(*element);
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTLISTPROPERTY_H
