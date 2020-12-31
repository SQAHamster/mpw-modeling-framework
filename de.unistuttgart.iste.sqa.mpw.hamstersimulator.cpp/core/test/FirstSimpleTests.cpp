#include "gtest/gtest.h"

#include "Tile.h"
#include "ConcreteHamster.h"

#include <memory>


#include "CompositeCommandBase.h"
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

