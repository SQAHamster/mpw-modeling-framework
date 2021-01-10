#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_HAMSTERVIEWTESTBASE_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_HAMSTERVIEWTESTBASE_H

#include <gtest/gtest.h>
#include "HamsterCore.h"

#include "GameViewModel.h"

#include <unordered_map>

class HamsterViewTestBase : public testing::Test {

protected:

    void SetUp() override;

    void withTerritorium(const std::string& path);

    void assertTerritory(const std::string& expected);
    void assertLog(const std::string& expected);

    std::shared_ptr<hamster::Hamster> paule;
    std::shared_ptr<hamsterviewmodel::GameViewModel> viewModel;

private:

    static void initCharMapping();

    int maxCharsPerCell = 4;
    static std::unordered_map<std::string, std::string> characterMap;
    std::shared_ptr<hamster::HamsterGame> game;

};


#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_HAMSTERVIEWTESTBASE_H
