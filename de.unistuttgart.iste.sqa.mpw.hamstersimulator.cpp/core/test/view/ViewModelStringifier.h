#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_VIEWMODELSTRINGIFIER_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_VIEWMODELSTRINGIFIER_H

#include "GameViewModel.h"
#include "ViewModelRow.h"
#include "ViewModelCell.h"
#include "ViewModelCellLayer.h"
#include "ViewModelLogEntry.h"

#include <unordered_map>

namespace viewmodel {

class ViewModelStringifier {
public:

    ViewModelStringifier(const std::unordered_map<std::string, std::string>& imageCharsMapping, int maxCharsPerCell);

    std::string territoryToExpectationString(const GameViewModel& viewModel);
    static std::string logToString(const GameViewModel& viewModel);

private:

    const std::string& getImageCharMapping(const std::string& key) const;

    std::string rowToString(const GameViewModel& viewModel, int y) const;
    std::string cellToString(const ViewModelCell& cell) const;

    const std::unordered_map<std::string, std::string>& imageCharsMapping;
    const int maxCharsPerCell;
};

}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_VIEWMODELSTRINGIFIER_H
