#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_GAMESTRINGIFIER_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_GAMESTRINGIFIER_H

#include <memory>
#include <string>

#include "HamsterGame.h"

namespace util {

class GameStringifier {
public:
    GameStringifier() = delete;

    static std::shared_ptr<hamster::HamsterGame> createFromString(const std::string& map);
    static std::string toString(const hamster::HamsterGame& game);
    static std::string grainsOnTerritoryToString(const hamster::HamsterGame& game);
};

}


#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_GAMESTRINGIFIER_H
