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
    withTerritorium("resources/territories/example01.ter");
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

//<editor-fold desc="helpers">

//</editor-fold>
