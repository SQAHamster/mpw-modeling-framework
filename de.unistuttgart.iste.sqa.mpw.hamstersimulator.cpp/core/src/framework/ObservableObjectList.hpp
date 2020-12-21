
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTLIST_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTLIST_H

#include <algorithm>
#include <list>
#include <functional>
#include "ObservableList.hpp"

namespace framework {

template<typename T>
class ObservableObjectList : public ObservableList<T> {

protected:

    std::list<std::reference_wrapper<T>> references{};

public:

    const std::list<std::reference_wrapper<T>> &get() const {
        return references;
    }

    void forEach(std::function<void(const T &)> consumer) const override {
        std::for_each(references.cbegin(), references.cend(), consumer);
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTLIST_H
