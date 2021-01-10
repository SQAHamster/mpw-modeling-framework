#include "UserInputInterfaceFake.h"

#include "FrameworkAssert.h"

using namespace framework;

namespace hamsterviewmodel {

int UserInputInterfaceFake::readInteger(std::string message) {
    assertCondition(!stubbedUserInputQueue.empty(), "please put an integer into user-input-queue");
    std::string result = stubbedUserInputQueue.back();
    stubbedUserInputQueue.pop();
    return std::stoi(result);
}

std::string UserInputInterfaceFake::readString(std::string message) {
    assertCondition(!stubbedUserInputQueue.empty(), "please put a string into user-input-queue");
    std::string result = stubbedUserInputQueue.back();
    stubbedUserInputQueue.pop();
    return result;
}

void UserInputInterfaceFake::confirmAlert(std::runtime_error t) {
    receivedAlerts.push_back(t);
}

void UserInputInterfaceFake::abort() {
}

void UserInputInterfaceFake::stubUserInput(const std::string& input) {
    stubbedUserInputQueue.push(input);
}

const std::vector<std::exception>& UserInputInterfaceFake::getReceivedAlerts() {
    return receivedAlerts;
}

}
