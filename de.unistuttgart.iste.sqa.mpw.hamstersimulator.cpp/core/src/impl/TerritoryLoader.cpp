#include "TerritoryLoader.h"

#include <utility>
#include <optional>

using namespace mpw;
using namespace hamster;

namespace hamster {

std::unique_ptr<TerritoryLoader> TerritoryLoader::initializeFor(hamster::HamsterGame& game) {
    auto builder = std::make_shared<TerritoryBuilder>(game.shared_from_this());
    return std::unique_ptr<TerritoryLoader>(new TerritoryLoader(builder));
}

TerritoryLoader::TerritoryLoader(std::shared_ptr<hamster::TerritoryBuilder> territoryBuilder)
    : territoryBuilder(std::move(territoryBuilder)) {

}

void TerritoryLoader::loadFromResourceFile(const std::string& territoryFile) {
    std::vector<std::string> list = readLinesFromTerritoryResourceFile(territoryFile);
    return interpretLoadedTerritoryLines(list);
}

void TerritoryLoader::loadFromInputStream(std::ifstream& inputStream) {
    std::vector<std::string> list = readLinesFromTerritoryInputStream(inputStream);
    interpretLoadedTerritoryLines(list);
}

void TerritoryLoader::interpretLoadedTerritoryLines(const std::vector<std::string>& list) {
    setSizeFromStrings(list);
    std::vector<std::string> territoryDefinition(list.begin()+2, list.end());
    buildTiles(territoryDefinition);
}

void TerritoryLoader::setSizeFromStrings(const std::vector<std::string>& lines) {
    this->loadedTerritoryDimensions.setColumnCount(std::stoi(lines[0]));
    this->loadedTerritoryDimensions.setRowCount(std::stoi(lines[1]));
    this->territoryBuilder->initTerritory(this->loadedTerritoryDimensions.getColumnCount(), this->loadedTerritoryDimensions.getRowCount()); // todo allow size as parameter
}

void TerritoryLoader::buildTiles(const std::vector<std::string>& lines) {
    std::vector<Location> grainLocations;
    std::optional<Location> defaultHamsterLocation = std::nullopt;
    std::optional<Direction> defaultHamsterDirection = std::nullopt;

    for (int row = 0; row < this->loadedTerritoryDimensions.getRowCount(); row++) {
        for (int column = 0; column < this->loadedTerritoryDimensions.getColumnCount(); column++) {
            Location currentLocation(column, row);
            const char tileCode = lines[row][column];
            switch (tileCode) {
                case ' ':
                    break;
                case '#':
                    createWallAt(currentLocation);
                    break;
                case '*':
                    grainLocations.push_back(currentLocation);
                    break;
                case '^':
                    grainLocations.push_back(currentLocation);
                    defaultHamsterLocation = currentLocation;
                    defaultHamsterDirection = Direction::NORTH;
                    break;
                case '>':
                    grainLocations.push_back(currentLocation);
                    defaultHamsterLocation = currentLocation;
                    defaultHamsterDirection = Direction::EAST;
                    break;
                case 'v':
                    grainLocations.push_back(currentLocation);
                    defaultHamsterLocation = currentLocation;
                    defaultHamsterDirection = Direction::SOUTH;
                    break;
                case '<':
                    grainLocations.push_back(currentLocation);
                    defaultHamsterLocation = currentLocation;
                    defaultHamsterDirection = Direction::WEST;
                    break;
                default:
                    throw std::runtime_error("Territory error.");
            }
        }
    }
    size_t lineOffsetForGrainsInMouth = this->loadedTerritoryDimensions.getRowCount() + grainLocations.size();
    const int initialGrainCount = std::stoi(lines[lineOffsetForGrainsInMouth]);
    territoryBuilder->initDefaultHamster(defaultHamsterLocation.value(), defaultHamsterDirection.value(), initialGrainCount);
    placeGrain(lines, grainLocations);
}

void TerritoryLoader::placeGrain(const std::vector<std::string>& lines, const std::vector<mpw::Location>& grainLocations) {
    for (size_t i = 0; i < grainLocations.size(); i++) {
        const Location& location = grainLocations[i];
        size_t lineOffsetBehindMapChars = this->loadedTerritoryDimensions.getRowCount() + i;
        const int count = std::stoi(lines[lineOffsetBehindMapChars]);
        territoryBuilder->addGrainsToTile(location, count);
    }
}

void TerritoryLoader::createWallAt(const Location& currentLocation) {
    territoryBuilder->addWallToTile(currentLocation);
}

std::vector<std::string> TerritoryLoader::readLinesFromTerritoryResourceFile(const std::string& territoryFileName) {
    std::ifstream in;

    in.open(territoryFileName);
    if (!in.is_open()) {
        throw std::runtime_error("Unable to load the territory from the filename: " + territoryFileName);
    }
    auto result = readLinesFromTerritoryInputStream(in);
    if (in.bad()) {
        throw std::runtime_error("Error while loading the territory from the filename: " + territoryFileName);
    }
    in.close();
    return result;
}

std::vector<std::string> TerritoryLoader::readLinesFromTerritoryInputStream(std::ifstream& inputStream) {
    std::vector<std::string> result;

    std::string line;
    while (std::getline(inputStream, line)) {
        result.push_back(line);
    }

    return result;
}

}
