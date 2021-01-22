#ifndef DE_UNISTUTTGART_HAMSTER_GAMEVIEWPRESENTERIMPL_H
#define DE_UNISTUTTGART_HAMSTER_GAMEVIEWPRESENTERIMPL_H

#include "GameViewModel.h"
#include "GameViewPresenter.h"
#include "ViewModelCell.h"

#include "HamsterGame.h"
#include "Tile.h"
#include "Wall.h"
#include "Grain.h"
#include "ReadOnlyHamster.h"
#include "LogEntry.h"

#include <unordered_map>

namespace viewmodel {

class GameViewPresenterImpl: public GameViewPresenter {
private:
	using inherited = GameViewPresenter;

public:

    GameViewPresenterImpl(std::shared_ptr<hamster::HamsterGame> game);

    void playClicked() override;
    void pauseClicked() override;
    void undoClicked() override;
    void redoClicked() override;

    void textTyped(std::string text) override;

    void bind() override;

private:

    void addTileNode(const mpw::Tile& tile);
    void removeTileNode(const mpw::Tile& tile);

    void setTileNodeAt(const mpw::Location& location, const mpw::Tile& tile);

    void configureGrainImageView(ViewModelCell& cell, const mpw::Tile& tile);
    void refreshGrainLayer(ViewModelCellLayer& layer, const mpw::Tile& tile);

    void configureWallImageView(ViewModelCell& cell, const mpw::Tile& tile);
    void refreshWallLayer(ViewModelCellLayer& layer, const mpw::Tile& tile);

    void configureHamsterImageView(ViewModelCell& cell, const hamster::ReadOnlyHamster& hamster);
    void refreshHamsterLayer(ViewModelCellLayer& layer, hamster::ReadOnlyHamster& hamster);
    static int getRotationForDirection(mpw::Direction direction);

    void addLogEntry(const mpw::LogEntry& entry);

    static std::list<std::shared_ptr<hamster::ReadOnlyHamster>> getHamstersOfTile(const mpw::Tile& tile);
    static std::list<std::shared_ptr<hamster::Wall>> getWallsOfTile(const mpw::Tile& tile);
    static std::list<std::shared_ptr<hamster::Grain>> getGrainOfTile(const mpw::Tile& tile);

    const std::shared_ptr<hamster::HamsterGame> game;

    std::unordered_map<const mpw::Tile*, unsigned int> addedContentListenerIds;
    std::unordered_map<const mpw::Tile*, unsigned int> removedContentListenerIds;
    std::unordered_map<const hamster::ReadOnlyHamster*, unsigned int> changedHamsterDirectionListenerIds;
};

}

#endif //DE_UNISTUTTGART_HAMSTER_GAMEVIEWPRESENTERIMPL_H
