#include <CollectionHelpers.hpp>
#include "GameStringifier.h"

#include "Tile.h"
#include "Grain.h"
#include "Wall.h"
#include "Territory.h"
#include "Hamster.h"
#include "GameTerritory.h"
#include "GameHamster.h"
#include "GamePerformance.h"

#include "TerritoryBuilder.h"
#include "DirectionTestHelper.h"
#include "TestUtils.h"

using namespace mpw;
using namespace hamster;

namespace util {

static void handleLine(TerritoryBuilder& territoryBuilder, int y, const std::string& part);
static void handleCell(TerritoryBuilder& territoryBuilder, int x, int y, char cell);

std::shared_ptr<hamster::HamsterGame> GameStringifier::createFromString(const std::string& map) {
    auto game = HamsterGame::create();

    std::vector<std::string> parts = TestUtils::split(";", map);
    int height = static_cast<int>(parts.size());
    int width = height > 0 ? static_cast<int>(parts[0].length()) : 0;

    auto territoryBuilder = std::make_shared<TerritoryBuilder>(game);
    territoryBuilder->initTerritory(width, height);

    for (int y = 0; y < height; y++) {
        handleLine(*territoryBuilder, y, parts[y]);
    }

    game->getPerformance()->setDelayEnabled(false);
    game->startGame();
    return game;
}

static void handleLine(TerritoryBuilder& territoryBuilder, int y, const std::string& part) {
    for (int x = 0; x < part.length(); x++) {
        handleCell(territoryBuilder, x, y, part[x]);
    }
}

static void handleCell(TerritoryBuilder& territoryBuilder, int x, int y, char cell) {
    switch (cell) {
        case '>':
        case '<':
        case '^':
        case 'v':
            territoryBuilder.initDefaultHamster(x, y, DirectionTestHelper::toDirection(cell), 0);
            break;
        case '*':
            territoryBuilder.addGrainsToTile(x, y, 1);
            break;
        case 'M':
            territoryBuilder.addWallToTile(x, y);
            break;
        default: ;
    }
}

static void iterateTiles(const HamsterGame& game, const std::function<void(Tile&)>& lambda);

std::string GameStringifier::toString(const HamsterGame& game) {
    std::string actual;

    auto& nonConstGame = const_cast<HamsterGame&>(game); // TODO fix this const-correctness issue
    auto hamster = nonConstGame.getTerritory()->getDefaultHamster()->getInternalHamster();
    iterateTiles(game, [&](Tile& currentTile) {
        if (hamster->getCurrentTile().get() == &currentTile) {
            actual += util::DirectionTestHelper::toDirection(hamster->getDirection());
        } else if (!collectionhelpers::type_select<Wall>(currentTile.getContents()).empty()) {
            actual += 'M';
        } else if (!collectionhelpers::type_select<Grain>(currentTile.getContents()).empty()) {
            actual += '*';
        } else {
            actual += ' ';
        }

        if (currentTile.getEast() == nullptr) {
            actual += ';';
        }
    });

    return actual;
}

std::string GameStringifier::grainsOnTerritoryToString(const HamsterGame& game) {
    std::string actual;

    iterateTiles(game, [&](Tile& currentTile) {
        auto grainsCount = collectionhelpers::type_select<Grain>(currentTile.getContents()).size();
        actual += std::to_string(grainsCount);

        if (currentTile.getEast() == nullptr) {
            actual += ';';
        }
    });

    return actual;
}

static void iterateTiles(const HamsterGame& game, const std::function<void(Tile&)>& lambda) {
    auto& nonConstGame = const_cast<HamsterGame&>(game); // TODO fix this const-correctness issue
    auto tiles = nonConstGame.getTerritory()->getInternalTerritory()->getTiles();
    auto upperLeftTile = collectionhelpers::get_at(tiles, 0).value();
    auto firstOfRowTile = upperLeftTile;

    std::shared_ptr<Tile> currentTile = upperLeftTile;

    while (currentTile != nullptr) {
        lambda(*currentTile);

        if (currentTile->getEast() == nullptr) {
            firstOfRowTile = firstOfRowTile->getSouth();
            currentTile = firstOfRowTile;
        } else {
            currentTile = currentTile->getEast();
        }
    }
}

}
