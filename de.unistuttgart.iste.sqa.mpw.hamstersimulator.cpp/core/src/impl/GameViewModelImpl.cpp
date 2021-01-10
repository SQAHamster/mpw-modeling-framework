#include "GameViewModelImpl.h"

#include "CollectionHelpers.hpp"

#include "ViewModelRow.h"

namespace hamsterviewmodel {

GameViewModelImpl::GameViewModelImpl() = default;

std::shared_ptr<hamsterviewmodel::ViewModelCell> GameViewModelImpl::getCellAt(
		int rowIndex, int columnIndex) {
    auto row = collectionhelpers::get_at(getRows(), rowIndex);
    auto cell = collectionhelpers::get_at(row->get()->getCells(), columnIndex);
    return cell.value();
}

void GameViewModelImpl::init(mpw::Size size) {
    setWidth(size.getColumnCount());
    setHeight(size.getRowCount());
    for (int rowIndex = 0; rowIndex < size.getRowCount(); rowIndex++) {
        auto row = std::make_shared<ViewModelRow>();
        addToRows(row);
        for (int columnIndex = 0; columnIndex < size.getColumnCount(); columnIndex++) {
            auto cell = std::make_shared<ViewModelCell>();
            row->addToCells(cell);
        }
    }
}

}

