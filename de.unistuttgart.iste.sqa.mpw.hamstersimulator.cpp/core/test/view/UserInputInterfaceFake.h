#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_USERINPUTINTERFACEFAKE_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_USERINPUTINTERFACEFAKE_H

#include "UserInputInterface.h"

#include <queue>
#include <vector>

namespace hamsterviewmodel {

class UserInputInterfaceFake final : public mpw::UserInputInterface {
public:

    int readInteger(std::string message) override;
    std::string readString(std::string message) override;
    void confirmAlert(std::runtime_error t) override;
    void abort() override;

    void stubUserInput(const std::string& input);
    const std::vector<std::exception>& getReceivedAlerts();

private:

    std::queue<std::string> stubbedUserInputQueue;
    std::vector<std::exception> receivedAlerts;
};

}

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_USERINPUTINTERFACEFAKE_H
