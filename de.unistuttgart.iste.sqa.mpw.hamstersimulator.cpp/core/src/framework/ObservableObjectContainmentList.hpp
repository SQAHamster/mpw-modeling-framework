
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTLIST_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTLIST_H

#include <list>
#include <functional>
#include <memory>
#include "ObservableObjectList.hpp"

namespace framework {

template<typename T>
class ObservableObjectContainmentList : public ObservableObjectList<T> {

private:

    std::list<std::shared_ptr<T>> elements{};

public:

    const std::list<std::shared_ptr<T>>& getElements() const {
        return elements;
    }

    void add(std::shared_ptr<T> element) {
        ObservableObjectList<T>::references.push_back(*element);
        elements.push_back(element);
        ObservableList<T>::notifyAdded(*element);
    }

    void remove(std::shared_ptr<T> element) {
        ObservableObjectList<T>::references.remove_if([element](auto& referenceWrapper) {
            return &referenceWrapper.get() == element.get();
        });
        elements.remove(element);
        ObservableList<T>::notifyRemoved(*element);
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTCONTAINMENTLIST_H
