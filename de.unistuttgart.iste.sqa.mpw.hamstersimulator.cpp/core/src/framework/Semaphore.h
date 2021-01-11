#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_SEMAPHORE_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_SEMAPHORE_H

#include <mutex>
#include <memory>

namespace framework {

/// \brief Semaphore implementation which reuses same underlying mutex when copying the object.
class Semaphore {

public:

    Semaphore();

private:

    std::shared_ptr<std::mutex> mutex;
};

}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_SEMAPHORE_H
