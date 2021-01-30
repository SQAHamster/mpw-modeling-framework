#ifndef DE_UNISTUTTGART_FRAMEWORK_SHAREDPOINTERLISTITERATOR_H
#define DE_UNISTUTTGART_FRAMEWORK_SHAREDPOINTERLISTITERATOR_H

#include <list>
#include <memory>
#include "InternalObjectIterator.hpp"

namespace framework {

template<typename T, typename iterator, bool constType>
class SharedPointerListIterator final : public InternalObjectIterator<T, constType> {
private:
    using ListType = typename std::conditional<constType, const std::list<std::shared_ptr<T>>, std::list<std::shared_ptr<T>>>::type;

    ListType& elements;
    iterator currentIterator;

public:

    using inherited = InternalObjectIterator<T, constType>;
    using ObjectReturnType = typename InternalObjectIterator<T, constType>::ObjectReturnType;

    SharedPointerListIterator(ListType& elements, iterator listIterator)
        : elements(elements)
        , currentIterator(listIterator)
    {
    }

    ~SharedPointerListIterator() override = default;

    std::unique_ptr<inherited> clone() override {
        return std::make_unique<SharedPointerListIterator<T, iterator, constType>>(elements, currentIterator);
    }

    ObjectReturnType* current() const override {
        return (*currentIterator).get();
    }

    ObjectReturnType* next() override {
        currentIterator++;
        return current();
    }

/*    bool operator==(const InternalObjectIterator <T>& rhs) const override {
        return currentIterator == rhs.currentIterator;
    }*/

};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_SHAREDPOINTERLISTITERATOR_H
