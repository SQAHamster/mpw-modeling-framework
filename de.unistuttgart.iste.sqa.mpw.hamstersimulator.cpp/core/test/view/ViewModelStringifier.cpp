#include "ViewModelStringifier.h"

#include "CollectionHelpers.hpp"

#include <algorithm>

namespace hamsterviewmodel {

ViewModelStringifier::ViewModelStringifier(
        const std::unordered_map<std::string, std::string>& imageCharsMapping, int maxCharsPerCell)
    : imageCharsMapping(imageCharsMapping)
    , maxCharsPerCell(maxCharsPerCell)
{
}

std::string ViewModelStringifier::territoryToExpectationString(const GameViewModel& viewModel) {
    auto& nonConstViewModel = const_cast<GameViewModel&>(viewModel); // TODO const-correctness: adapt after migrate generator
    std::string actual;
    int height = nonConstViewModel.getHeight();
    for (int y = 0; y < height; y++) {
        std::string rowString = rowToString(viewModel, y);
        actual.append(rowString);
        actual.append("\n");
    }
    return actual;
}

std::string ViewModelStringifier::rowToString(const GameViewModel& viewModel, int y) const {
    auto& nonConstViewModel = const_cast<GameViewModel&>(viewModel); // TODO const-correctness: adapt after migrate generator
    std::string result = "|";
    int width = nonConstViewModel.getWidth();
    for (int x = 0; x < width; x++) {
        auto cell = nonConstViewModel.getCellAt(y, x);
        result.append(cellToString(*cell));
        result.append("|");
    }
    return result;
}

std::string ViewModelStringifier::cellToString(const ViewModelCell& cell) const {
    auto& nonConstCell = const_cast<ViewModelCell&>(cell); // TODO const-correctness: adapt after migrate generator
    std::string result;
    for (const auto& layer : nonConstCell.getLayers()) {
        auto& nonConstLayer = const_cast<ViewModelCellLayer&>(*layer);
        if (nonConstLayer.getVisible()) {
            std::string key = nonConstLayer.getImageName();
            int rotation = nonConstLayer.getRotation();
            if (rotation != 0) {
                key.append("[");
                key.append(std::to_string(rotation));
                key.append("]");
            }
            result.append(getImageCharMapping(key));
        }
    }
    int length = static_cast<int>(result.length());
    int spaces = std::max(0, maxCharsPerCell - length);
    for (size_t i = 0; i < spaces; i++) {
        result.append(" ");
    }
    return result;
}

std::string ViewModelStringifier::logToString(const GameViewModel& viewModel) {
    auto& nonConstViewModel = const_cast<GameViewModel&>(viewModel); // TODO const-correctness: adapt after migrate generator
    std::string actual;
    for (auto& entry : nonConstViewModel.getLogEntries()) {
        actual.append(entry);
        actual.append("\n");
    }
    return actual;
}

const std::string& ViewModelStringifier::getImageCharMapping(const std::string& key) const {
    auto iter = imageCharsMapping.find(key);
    return (*iter).second;
}

}
