#include "gtest/gtest.h"

#include "HamsterCore.h"
#include "HamsterViewTestBase.h"

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
class HamsterViewModelTest : public HamsterViewTestBase {
private:
public:
};

TEST_F(HamsterViewModelTest, testInit) { /* NOLINT */
    withTerritorium("/territories/example01.ter");
    assertTerritory(
            "|####|####|####|####|####|\n"
            "|####|>   |    | 2* |####|\n"
            "|####|####|####|####|####|\n");
    EXPECT_EQ(true, paule->mouthEmpty());
    EXPECT_EQ(true, paule->frontIsClear());
    EXPECT_EQ(false, paule->grainAvailable());
    EXPECT_EQ(Direction::EAST, paule->getDirection());
    EXPECT_EQ(1, paule->getLocation().getRow());
    EXPECT_EQ(1, paule->getLocation().getColumn());
}


TEST_F(HamsterViewModelTest, testMove) {
        withTerritorium("/territories/example01.ter");
        paule->move();
        assertTerritory(
        "|####|####|####|####|####|\n"
        "|####|    |>   | 2* |####|\n"
        "|####|####|####|####|####|\n");
        EXPECT_EQ(true, paule->mouthEmpty());
        EXPECT_EQ(true, paule->frontIsClear());
        EXPECT_EQ(false, paule->grainAvailable());
        EXPECT_EQ(Direction::EAST, paule->getDirection());
        EXPECT_EQ(1, paule->getLocation().getRow());
        EXPECT_EQ(2, paule->getLocation().getColumn());
}

TEST_F(HamsterViewModelTest, testPickGrain) {
        withTerritorium("/territories/example01.ter");
        paule->move();
        paule->move();
        paule->pickGrain();
        assertTerritory(
        "|####|####|####|####|####|\n"
        "|####|    |    | 1*>|####|\n"
        "|####|####|####|####|####|\n");
        EXPECT_EQ(false, paule->mouthEmpty());
        EXPECT_EQ(false, paule->frontIsClear());
        EXPECT_EQ(true, paule->grainAvailable());
        EXPECT_EQ(Direction::EAST, paule->getDirection());
        EXPECT_EQ(1, paule->getLocation().getRow());
        EXPECT_EQ(3, paule->getLocation().getColumn());
}

TEST_F(HamsterViewModelTest, testPickGrainAndPutGrain) {
        withTerritorium("/territories/example01.ter");
        paule->move();
        paule->move();
        paule->pickGrain();
        paule->putGrain();
        assertTerritory(
        "|####|####|####|####|####|\n"
        "|####|    |    | 2*>|####|\n"
        "|####|####|####|####|####|\n");
        EXPECT_EQ(true, paule->mouthEmpty());
        EXPECT_EQ(false, paule->frontIsClear());
        EXPECT_EQ(true, paule->grainAvailable());
        EXPECT_EQ(Direction::EAST, paule->getDirection());
        EXPECT_EQ(1, paule->getLocation().getRow());
        EXPECT_EQ(3, paule->getLocation().getColumn());
}

TEST_F(HamsterViewModelTest, testMoveAndRotateAndMove) {
        withTerritorium("/territories/example01.ter");
        paule->move();
        paule->turnLeft();
        paule->turnLeft();
        paule->move();
        assertTerritory(
        "|####|####|####|####|####|\n"
        "|####|<   |    | 2* |####|\n"
        "|####|####|####|####|####|\n");
        EXPECT_EQ(true, paule->mouthEmpty());
        EXPECT_EQ(false, paule->frontIsClear());
        EXPECT_EQ(false, paule->grainAvailable());
        EXPECT_EQ(Direction::WEST, paule->getDirection());
        EXPECT_EQ(1, paule->getLocation().getRow());
        EXPECT_EQ(1, paule->getLocation().getColumn());
}

TEST_F(HamsterViewModelTest, testMoveAgainstWall) {
        withTerritorium("/territories/example01.ter");
        paule->move();
        paule->turnLeft();

        TestUtils::assertThrows(typeid(CommandConstraintException), [&] {
            paule->move();
        });
}

TEST_F(HamsterViewModelTest, testLog) {
        withTerritorium("/territories/example01.ter");
        paule->move();
        paule->move();
        paule->pickGrain();
        paule->putGrain();
        paule->turnLeft();
        paule->write("Hello");
        assertLog(
            "Move\n"
            "Move\n"
            "Pick Grain\n"
            "Put Grain\n"
            "Turn Left\n"
            "Hello\n");
}
