#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_COLLECTION_HELPERS_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_COLLECTION_HELPERS_H

#include <list>
#include <optional>

namespace collectionhelpers {
  template<typename T>
  std::optional<T> get_at(const std::list<T>& list, size_t index) {
    if (index >= 0 && index < list.size()) {
      auto iter = list.begin();
      std::advance(iter, index);
      return *iter;
    }
    return std::nullopt;
  }
}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_COLLECTION_HELPERS_H
