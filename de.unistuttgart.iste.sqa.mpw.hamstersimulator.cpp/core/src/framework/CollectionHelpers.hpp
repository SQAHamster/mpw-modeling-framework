#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_COLLECTION_HELPERS_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_COLLECTION_HELPERS_H

#include <list>
#include <vector>
#include <memory>
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

  template<typename T>
  std::optional<T> get_at(const std::vector<T>& list, size_t index) {
      if (index >= 0 && index < list.size()) {
          return list[index];
      }
      return std::nullopt;
  }

  template<typename TGT, typename SRC>
  std::list<std::shared_ptr<TGT>> type_select(const std::list<std::shared_ptr<SRC>>& list) {
      std::list<std::shared_ptr<TGT>> result;
      for (auto element : list) {
        auto targetElement = std::dynamic_pointer_cast<TGT>(element);
          if (targetElement != nullptr) {
              result.push_back(targetElement);
          }
      }
      return result;
  }
}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_COLLECTION_HELPERS_H
