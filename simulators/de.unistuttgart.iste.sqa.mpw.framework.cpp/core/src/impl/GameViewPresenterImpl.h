#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_FRAMEWORK_GAMEVIEWPRESENTERIMPL_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_FRAMEWORK_GAMEVIEWPRESENTERIMPL_H

#include "GameViewModel.h"
#include "GameViewPresenter.h"
#include "ViewModelCell.h"

#include "MiniProgrammingWorld.h"
#include "Tile.h"
#include "LogEntry.h"

#include <unordered_map>

#include "Direction.h"

namespace viewmodel {

class GameViewPresenterImpl: public GameViewPresenter {
private:
	using inherited = GameViewPresenter;

public:

    GameViewPresenterImpl(std::shared_ptr<mpw::MiniProgrammingWorld> miniProgrammingWorld);

    void playClicked() override;
    void pauseClicked() override;
    void undoClicked() override;
    void redoClicked() override;
    void speedChanged(double speedValue) override;

    void close() override;

    void textTyped(std::string text) override;

    void bind() override;

protected:

  virtual void onBind();
  virtual void onSetTileNodeAtForCell(ViewModelCell& cell, const mpw::Tile& tile) = 0;

  static int getRotationForDirection(mpw::Direction direction);

private:

    void addTileNode(const mpw::Tile& tile);
    void removeTileNode(const mpw::Tile& tile);

    void setTileNodeAt(const mpw::Location& location, const mpw::Tile& tile);

    void addLogEntry(const mpw::LogEntry& entry);

    const std::shared_ptr<mpw::MiniProgrammingWorld> miniProgrammingWorld;

    std::unordered_map<const mpw::Tile*, unsigned int> addedContentListenerIds;
    std::unordered_map<const mpw::Tile*, unsigned int> removedContentListenerIds;
};

}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_FRAMEWORK_GAMEVIEWPRESENTERIMPL_H
