#include "gtest/gtest.h"

#include "HamsterCore.h"

#include "util/GameStringifier.h"
#include "util/TestUtils.h"

#include <utility>
#include <vector>
#include <string>

using namespace mpw;
using namespace hamster;
using namespace framework;
using namespace util;

/// \note use 'NO-LINT' comment at tests to suppress a warning caused by TEST_F
class InitHamsterCommandTest : public testing::Test {
private:
public:
    static Location locationOf(int column, int row);
};

TEST_F(InitHamsterCommandTest, testInitHamsterOn1x1_and4Grains) { /* NOLINT */
    auto game = GameStringifier::createFromString("   ;"
                                                        "   ;");

    auto sut = game->getTerritory()->getDefaultHamster();
    sut->init(game->getTerritory(), locationOf(1, 1), Direction::SOUTH, 4);

    std::string actual = GameStringifier::toString(*game);
    EXPECT_EQ("   ;"
                 " v ;", actual);
    EXPECT_EQ(4, sut->getInternalHamster()->getGrains().size());
}

TEST_F(InitHamsterCommandTest, testInitHamster_invalidGrainCount) { /* NOLINT */
    auto game = GameStringifier::createFromString(" ;");

    auto sut = game->getTerritory()->getDefaultHamster();
    TestUtils::assertThrows(typeid(CommandConstraintException), [&]() {
        sut->init(game->getTerritory(), locationOf(0, 0), Direction::SOUTH, -1);
    });
}

TEST_F(InitHamsterCommandTest, testUndoInitHamster) { /* NOLINT */
    auto game = GameStringifier::createFromString("  ;");

    auto sut = game->getTerritory()->getDefaultHamster();
    sut->init(game->getTerritory(), locationOf(0, 0), Direction::SOUTH, 2);
    game->getCommandStack()->undo();

    EXPECT_EQ(Direction::NORTH, sut->getInternalHamster()->getDirection());
    EXPECT_EQ(0, sut->getInternalHamster()->getGrains().size());
}

//<editor-fold desc="helpers">

Location InitHamsterCommandTest::locationOf(int column, int row) {
    return Location::from(column, row);
}

//</editor-fold>
