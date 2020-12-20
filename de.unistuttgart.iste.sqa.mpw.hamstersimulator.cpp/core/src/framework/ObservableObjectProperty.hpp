
#ifndef DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTPROPERTY_H
#define DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTPROPERTY_H

#include <vector>
#include <functional>
#include "ObservableProperty.hpp"

namespace framework {

template<typename T>
class ObservableObjectProperty : public ObservableProperty<std::shared_ptr<T>> {

};

}

#endif //DE_UNISTUTTGART_FRAMEWORK_OBSERVABLEOBJECTPROPERTY_H
