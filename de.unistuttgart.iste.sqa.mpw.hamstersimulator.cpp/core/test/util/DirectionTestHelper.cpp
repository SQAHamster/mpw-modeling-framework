#include "DirectionTestHelper.h"

#include <stdexcept>
#include <string>

namespace util {

mpw::Direction DirectionTestHelper::toDirection(char c) {
    switch (c) {
        case '>':
            return mpw::Direction::EAST;
        case '<':
            return mpw::Direction::WEST;
        case '^':
            return mpw::Direction::NORTH;
        case 'v':
            return mpw::Direction::SOUTH;
    }
    throw std::runtime_error(std::string("invalid direction: ") + c);
}

char DirectionTestHelper::toDirection(mpw::Direction d) {
    switch (d) {
        case mpw::Direction::WEST: {
            return '<';
        }
        case mpw::Direction::EAST: {
            return '>';
        }
        case mpw::Direction::NORTH: {
            return '^';
        }
        case mpw::Direction::SOUTH: {
            return 'v';
        }
    }
    return '-';
}

}
