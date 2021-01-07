
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTLISTPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTLISTPROPERTY_H

#include <algorithm>
#include <list>
#include <functional>
#include "ObservableListProperty.hpp"

namespace framework {

template<typename T>
class ObservableObjectListProperty : public ObservableListProperty<T> {

protected:

    std::list<std::reference_wrapper<T>> references{};

public:

    const std::list<std::reference_wrapper<T>>& getReferences() const {
        return references;
    }

    virtual std::list<std::shared_ptr<T>> get() const = 0;
    std::shared_ptr<T> front() const {
        if (references.size() > 0) {
            return references.front().get().shared_from_this();
        }
        return nullptr;
    }

    bool empty() const override {
        return references.empty();
    }

    void forEach(std::function<void(const T &)> consumer) const override {
        std::for_each(references.cbegin(), references.cend(), consumer);
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTLISTPROPERTY_H
