#include "HamsterViewTestBase.h"

#include "GameViewPresenterImpl.h"
#include "UserInputInterfaceFake.h"
#include "ViewModelStringifier.h"

using namespace hamster;
using namespace viewmodel;

std::unordered_map<std::string, std::string> HamsterViewTestBase::characterMap;

void HamsterViewTestBase::SetUp() {
    initCharMapping();
}

void HamsterViewTestBase::withTerritorium(const std::string& path) {
    game = HamsterGame::create();
    TerritoryLoader::initializeFor(*game)->loadFromResourceFile("resources" + path);
    // game->startGame(false);
    // game->setSpeed(HamsterGame.NO_SPEED);

    auto territory = game->getTerritory();
    paule = territory->getDefaultHamster();

    presenter = std::make_shared<GameViewPresenterImpl>(game);
    presenter->bind();
    viewModel = presenter->getViewModel();

    game->setUserInputInterface(std::make_shared<UserInputInterfaceFake>());
}

void HamsterViewTestBase::assertTerritory(const std::string& expected) {
    std::string actual = ViewModelStringifier(characterMap, maxCharsPerCell).territoryToExpectationString(*viewModel);
    EXPECT_EQ(expected, actual);
}

void HamsterViewTestBase::assertLog(const std::string& expected) {
    std::string actual = ViewModelStringifier::logToString(*viewModel);
    EXPECT_EQ(expected, actual);
}

void HamsterViewTestBase::initCharMapping() {
    characterMap["1Corn32"] = " 1*";
    characterMap["2Corn32"] = " 2*";
    characterMap["3Corn32"] = " 3*";
    characterMap["4Corn32"] = " 4*";
    characterMap["5Corn32"] = " 5*";
    characterMap["6Corn32"] = " 6*";
    characterMap["7Corn32"] = " 7*";
    characterMap["8Corn32"] = " 8*";
    characterMap["9Corn32"] = " 9*";
    characterMap["10Corn32"] = "10*";
    characterMap["11Corn32"] = "11*";
    characterMap["12Corn32"] = "12*";
    characterMap["12PlusCorn32"] = "12+";
    characterMap["Hamster32"] = ">";
    characterMap["Hamster32[90]"] = "v";
    characterMap["Hamster32[180]"] = "<";
    characterMap["Hamster32[270]"] = "^";
    characterMap["Wall32"] = "####";
}

