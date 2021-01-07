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

/// \note use 'NO-LINT' comment at tests to suppress a warning caused by TEST_F /* NOLINT */
class TerritoryBuilderTest : public testing::Test {
private:
    std::shared_ptr<HamsterGame> game {};
    std::shared_ptr<TerritoryBuilder> sut {};

public:

    TerritoryBuilder& withTerritoryBuilder();
    TerritoryBuilder& withTerritory(const std::string& map);
    void assertGrainsOnTerritory(const std::string& expected);
    void assertTerritory(const std::string& expected);
    int amountOf(int amount);
    Location locationOf(int column, int row);

};

TEST_F(TerritoryBuilderTest, givenEmptyTerritory_whenInitializeTo5x3_thenHas5Rows_and3Columns_andAllAreEmpty) { /* NOLINT */
    withTerritoryBuilder()
            .initTerritory(5, 3);

    assertTerritory("     ;"
                    "     ;"
                    "     ;");
}

TEST_F(TerritoryBuilderTest, givenEmptyTerritory3x2_whenAddOneGrainTo2x0_thenOneGrainIsPlacedOn2x0) { /* NOLINT */
    withTerritory("   ;"
                  "   ;")
            .addGrainsToTile(locationOf(2, 0), amountOf(1));

    assertGrainsOnTerritory("  1;"
                            "   ;");
}

TEST_F(TerritoryBuilderTest, givenEmptyTerritory3x2_whenAddTwoGrainsTo1x1_thenTwoGrainsArePlacedOn1x1) { /* NOLINT */
    withTerritory("   ;"
                  "   ;")
            .addGrainsToTile(locationOf(1, 1), amountOf(2));

    assertGrainsOnTerritory("   ;"
                            " 2 ;");
}

TEST_F(TerritoryBuilderTest, givenEmptyTerritory3x2_whenAddWallTo2x0_thenWallIsPlacedOn2x0) { /* NOLINT */
    withTerritory("   ;"
                  "   ;")
            .addWallToTile(locationOf(2, 0));

    assertTerritory("  M;"
                    "   ;");
}

TEST_F(TerritoryBuilderTest, givenTerritory3x2_andHamsterOn0x0_andWallOn1x1_andGrainOn2x0_whenClearTile2x0_thenTile2x0IsEmpty) { /* NOLINT */
    withTerritory("v *;"
                  " M ;")
            .clearTile(locationOf(2, 0));

    assertTerritory("v  ;"
                    " M ;");
}

TEST_F(TerritoryBuilderTest, givenTerritory3x2_andHamsterOn0x0_andWallOn1x1_andGrainOn2x0_whenClearTile1x1_thenTile1x1IsEmpty) { /* NOLINT */
    withTerritory("v *;"
                  " M ;")
            .clearTile(locationOf(1, 1));

    assertTerritory("v *;"
                    "   ;");
}

TEST_F(TerritoryBuilderTest, givenTerritory1x1_andFiveGrainsOn0x0_whenClearTile0x0_thenTile0x0IsEmpty) { /* NOLINT */
    withTerritory(" ;")
            .addGrainsToTile(locationOf(0, 0), amountOf(5))
            .clearTile(locationOf(0, 0));

    assertTerritory(" ;");
}

//<editor-fold desc="helpers">

TerritoryBuilder& TerritoryBuilderTest::withTerritoryBuilder() {
    game = HamsterGame::create();
    sut = std::make_shared<TerritoryBuilder>(game);
    return *sut;
}

/* used to create a already initialized territory */
TerritoryBuilder& TerritoryBuilderTest::withTerritory(const std::string& map) {
    game = GameStringifier::createFromString(map);
    sut = std::make_shared<TerritoryBuilder>(game);
    return *sut;
}

void TerritoryBuilderTest::assertGrainsOnTerritory(const std::string& expected) {
    std::string actual = GameStringifier::grainsOnTerritoryToString(*game);
    EXPECT_EQ(expected, TestUtils::replaceAll(actual, "0", " "));
}

void TerritoryBuilderTest::assertTerritory(const std::string& expected) {
    std::string actual = GameStringifier::toString(*game);
    EXPECT_EQ(expected, actual);
}

int TerritoryBuilderTest::amountOf(int amount) {
    return amount;
}

Location TerritoryBuilderTest::locationOf(int column, int row) {
    return Location::from(column, row);
}

//</editor-fold>
