#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_TERRITORYLOADER_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_TERRITORYLOADER_H

#include "HamsterCore.h"
#include <vector>
#include <memory>
#include <fstream>

namespace hamster {

class TerritoryLoader {
public:
    static std::unique_ptr<TerritoryLoader> initializeFor(hamster::HamsterGame& game);

    void loadFromResourceFile(const std::string& territoryFile);

    void loadFromInputStream(std::ifstream& inputStream);

private:

    explicit TerritoryLoader(std::shared_ptr<hamster::TerritoryBuilder> territoryBuilder);

    void interpretLoadedTerritoryLines(const std::vector<std::string>& list);

    void setSizeFromStrings(const std::vector<std::string>& lines);

    void buildTiles(const std::vector<std::string>& lines);

    static std::vector<std::string> readLinesFromTerritoryResourceFile(const std::string& territoryFileName);

    static std::vector<std::string> readLinesFromTerritoryInputStream(std::ifstream& inputStream);

    void placeGrain(const std::vector<std::string>& lines, const std::vector<mpw::Location>& grainLocations);

    void createWallAt(const mpw::Location& currentLocation);

    const std::shared_ptr<hamster::TerritoryBuilder> territoryBuilder;
    mpw::Size loadedTerritoryDimensions;
};

}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_TERRITORYLOADER_H
