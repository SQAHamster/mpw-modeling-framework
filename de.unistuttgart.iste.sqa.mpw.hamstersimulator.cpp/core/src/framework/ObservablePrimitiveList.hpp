
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVELIST_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVELIST_H

#include <list>
#include <memory>
#include "ObservableList.hpp"

namespace framework {

template<typename T>
class ObservablePrimitiveList : public ObservableList<T> {

private:

    std::list<T> elements{};

public:

    const std::list<T> &get() const {
        return elements;
    }

    void add(T element) {
        elements.push_back(element);
        ObservableList<T>::notifyAdded(element);
    }

    void remove(T element) {
        elements.remove(element);
        ObservableList<T>::notifyRemoved(element);
    }

    void forEach(std::function<void(const T &)> consumer) const override {
        std::for_each(elements.cbegin(), elements.cend(), consumer);
    }

};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEPRIMITIVELIST_H
