#include "Semaphore.h"

namespace framework {

Semaphore::Semaphore()
: mutex(std::make_shared<std::mutex>()) {

}

}
