#include "gtest/gtest.h"

#include "Tile.h"
#include "ConcreteHamster.h"

#include <memory>

#include "ConcreteTerritory.h"

using namespace mpw;
using namespace hamster;

TEST(SetterTest, testSettingWestOfTile) {
    auto east = std::make_shared<Tile>();
    auto west = std::make_shared<Tile>();

    east->setWest(west);

    EXPECT_EQ(west, east->getWest());
    EXPECT_EQ(east, west->getEast());
}

TEST(ReflectionTest, testSettingLocationByReflection) {
    auto tile = std::make_shared<Tile>();

    {
        auto location = Location::from(1, 2);
        tile->setProperty("location", &location);
    }

    EXPECT_EQ(Location::from(1, 2), tile->getLocation());
}

TEST(QueryTest, testQuery) {
  auto hamster = std::make_shared<ConcreteHamster>();
  auto territory = std::make_shared<ConcreteTerritory>();

  //EXPECT_EQ(false, hamster->grainAvailable());
  //EXPECT_EQ(std::nullopt, territory->getTileAt(Location::from(0, 0)));
}

