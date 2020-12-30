
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTREFERENCELISTPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTREFERENCELISTPROPERTY_H

#include <list>
#include <functional>
#include <memory>
#include "ObservableObjectListProperty.hpp"

namespace framework {

template<typename T>
class ObservableObjectReferenceListProperty : public ObservableObjectListProperty<T> {

private:

    std::list<std::weak_ptr<T>> elements{};

public:

    std::list<std::shared_ptr<T>> get() const override {
        std::list<std::shared_ptr<T>> result;
        for (auto elementWeak : elements) {
            if (auto element = elementWeak.lock()) {
                result.push_back(element);
            }
        }
        return result;
    }

    const std::list<std::weak_ptr<T>>& getElements() const {
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
        elements.remove_if([element](auto& weakPtr) {
            return weakPtr.lock() == element;
        });
        ObservableListProperty<T>::notifyRemoved(*element);
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTREFERENCELISTPROPERTY_H
