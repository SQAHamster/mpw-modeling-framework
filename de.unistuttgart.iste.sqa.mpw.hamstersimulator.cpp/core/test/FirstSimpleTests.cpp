#include "gtest/gtest.h"

#include "Tile.h"
#include "Grain.h"
#include "ConcreteHamster.h"

#include <memory>

#include "CompositeCommandBase.h"
#include "ConcreteTerritory.h"
#include "SetPropertyCommandImpl.h"
#include "AddEntityCommandImpl.h"
#include "RemoveEntityCommandImpl.h"

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
        tile->setProperty(Tile::cFeatureKeyLocation, &location);
    }

    EXPECT_EQ(Location::from(1, 2), tile->getLocation());
}

class CompositeCommandDummy : public commands::CompositeCommandBase {

public:
    void execute() override {}
};

TEST(AddRemoveTest, testAddRemove) {
  auto hamster = std::make_shared<ConcreteHamster>();
  auto territory = std::make_shared<ConcreteTerritory>();
  auto pStage = territory->shared_from_this();

  territory->addToTileContents(hamster);
  EXPECT_EQ(1, territory->getTileContents().size());

  territory->removeFromTileContents(hamster);
  EXPECT_EQ(0, territory->getTileContents().size());


  auto dummyParentCommand = std::make_shared<CompositeCommandDummy>();
  auto dummySubCommand = std::make_shared<CompositeCommandDummy>();

  dummyParentCommand->addToSubCommands(dummySubCommand);
  EXPECT_EQ(1, dummyParentCommand->getSubCommands().size());

  dummyParentCommand->removeFromSubCommands(dummySubCommand);
  EXPECT_EQ(0, dummyParentCommand->getSubCommands().size());
}

class CompositeCommandDummyTest : public testing::Test, public commands::CompositeCommandBase {
public:
    void execute() override { }

    Command& at(size_t i) {
        auto list = getSubCommands();
        auto iter = list.begin();
        std::advance(iter, i);
        return *(*iter);
    }
};

TEST_F(CompositeCommandDummyTest, testPrimitiveCommands) {
    auto hamster = std::make_shared<ConcreteHamster>();
    hamster->setDirection(Direction::SOUTH);
    auto territory = std::make_shared<ConcreteTerritory>();
    auto tile = std::make_shared<Tile>();

    executeSetProperty(hamster, Actor::cFeatureKeyDirection, (int)hamster->getDirection(), (int)Direction::WEST);
    executeSetValueProperty(tile, Tile::cFeatureKeyLocation, tile->getLocation(), Location::from(1, 2));
    executeAddReference(territory, Stage::cFeatureKeyTiles, tile);

    EXPECT_EQ(Direction::WEST, hamster->getDirection());
    EXPECT_EQ(Location::from(1, 2), tile->getLocation());
    EXPECT_EQ(territory->getTiles().front(), tile);

    executeSetProperty(hamster, Actor::cFeatureKeyDirection, (int)hamster->getDirection(), (int)Direction::NORTH);
    executeSetValueProperty(tile, Tile::cFeatureKeyLocation, tile->getLocation(), Location::from(3, 5));
    executeRemoveReference(territory, Stage::cFeatureKeyTiles, tile);

    EXPECT_EQ(Direction::NORTH, hamster->getDirection());
    EXPECT_EQ(Location::from(3, 5), tile->getLocation());
    EXPECT_TRUE(territory->getTiles().empty());

    at(5).undo();
    at(4).undo();
    at(3).undo();

    EXPECT_EQ(Direction::WEST, hamster->getDirection());
    EXPECT_EQ(Location::from(1, 2), tile->getLocation());
    EXPECT_EQ(territory->getTiles().front(), tile);

    at(3).redo();
    at(4).redo();
    at(5).redo();

    EXPECT_EQ(Direction::NORTH, hamster->getDirection());
    EXPECT_EQ(Location::from(3, 5), tile->getLocation());
    EXPECT_TRUE(territory->getTiles().empty());

    this->undo();

    EXPECT_EQ(Direction::SOUTH, hamster->getDirection());
    EXPECT_EQ(Location::from(0, 0), tile->getLocation());
    EXPECT_TRUE(territory->getTiles().empty());

    this->redo();

    EXPECT_EQ(Direction::NORTH, hamster->getDirection());
    EXPECT_EQ(Location::from(3, 5), tile->getLocation());
    EXPECT_TRUE(territory->getTiles().empty());
}

TEST(PropertyTest, testProperties) {
    auto grain = std::make_shared<Grain>();
    auto tile1 = std::make_shared<Tile>();
    auto tile2 = std::make_shared<Tile>();
    grain->setCurrentTile(tile1);
    grain->setCurrentTile(tile2);
    EXPECT_TRUE(tile1->getContents().empty());
    EXPECT_EQ(grain.get(), tile2->getContents().front().get());
    EXPECT_EQ(tile2.get(), grain->getCurrentTile().get());
}

