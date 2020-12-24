#include "gtest/gtest.h"

#include "Tile.h"

#include <memory>

using namespace mpw;

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

