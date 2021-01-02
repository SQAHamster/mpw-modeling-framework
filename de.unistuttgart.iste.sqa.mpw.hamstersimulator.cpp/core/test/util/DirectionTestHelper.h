#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_DIRECTIONTESTHELPER_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_DIRECTIONTESTHELPER_H

#include "Direction.h"

namespace util {

class DirectionTestHelper {
public:
    DirectionTestHelper() = delete;

    static mpw::Direction toDirection(char c);
    static char toDirection(mpw::Direction d);
};

}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_DIRECTIONTESTHELPER_H
