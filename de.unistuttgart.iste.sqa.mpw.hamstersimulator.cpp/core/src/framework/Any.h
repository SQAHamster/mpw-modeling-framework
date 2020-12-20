#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_ANY_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_ANY_H

#include <variant>
#include <string>

using EntityReference = void*;
using Any = std::variant<
        int,
        float,
        bool,
        std::string,
        EntityReference>;

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_ANY_H
