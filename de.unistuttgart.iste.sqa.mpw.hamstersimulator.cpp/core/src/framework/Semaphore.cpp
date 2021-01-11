#include "Semaphore.h"

namespace framework {

Semaphore::Semaphore()
: mutex(std::make_shared<std::mutex>()) {

}

SemaphoreLock Semaphore::lock() {
    return SemaphoreLock(*mutex);
}

void Semaphore::aquire() {
    mutex->lock();
}

void Semaphore::release() {
    mutex->unlock();
}

bool Semaphore::isLocked() {
    return mutex->try_lock();
}

}
