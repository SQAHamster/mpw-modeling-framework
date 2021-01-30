#ifndef DE_UNISTUTTGART_FRAMEWORK_OBJECTITERATOR_H
#define DE_UNISTUTTGART_FRAMEWORK_OBJECTITERATOR_H

#include <algorithm>
#include <list>
#include <functional>
#include <utility>
#include <memory>
#include <iterator>
#include "InternalObjectIterator.hpp"

namespace framework {

template<typename T, bool constType>
class ObjectIterator {
public:
    using InternalObjectIterator = InternalObjectIterator<T, constType>;

private:
    std::unique_ptr<InternalObjectIterator> internalIterator;

public:

    using ObjectReturnType = typename std::conditional<constType, const T, T>::type;

    using self_type = ObjectIterator;
    using value_type = ObjectReturnType;
    using iterator_category = typename std::forward_iterator_tag;
    using difference_type = int;
    using reference = ObjectReturnType&;
    using pointer = ObjectReturnType*;

    explicit ObjectIterator(std::unique_ptr<InternalObjectIterator> innerListIterator)
        : internalIterator(std::move(innerListIterator))
    {
    }

    ObjectIterator(const ObjectIterator& rhs)
        : internalIterator(rhs.internalIterator->clone())
    {
    }

    self_type operator++() {
        self_type i = *this;
        internalIterator->next();
        return i;
    }

    reference operator*() {
        return *internalIterator->current();
    }

    pointer operator->() {
        return internalIterator->current();
    }

    bool operator==(const self_type& rhs) {
        return internalIterator->current() == rhs.internalIterator->current();
    }

    bool operator!=(const self_type& rhs) {
        return internalIterator->current() != rhs.internalIterator->current();
    }
};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBJECTITERATOR_H
