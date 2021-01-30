#include "DirectionTestHelper.h"

#include <stdexcept>
#include <string>

template<typename list, typename iterator>
class Foo {
public:

    Foo(list& l, iterator iter) {
        result = (endIter(l) == iter);
    }

    template<typename iterator_type=iterator>
    typename std::enable_if<std::is_same<iterator_type, typename list::iterator>::value, iterator_type>::type endIter(list& l) {
        return l.end();
    }
    template<typename iterator_type=iterator>
    typename std::enable_if<std::is_same<iterator_type, typename list::const_iterator>::value, iterator_type>::type endIter(list& l) {
        return l.cend();
    }
    template<typename iterator_type=iterator>
    typename std::enable_if<std::is_same<iterator_type, typename list::reverse_iterator>::value, iterator_type>::type endIter(list& l) {
        return l.rend();
    }
    template<typename iterator_type=iterator>
    typename std::enable_if<std::is_same<iterator_type, typename list::const_reverse_iterator>::value, iterator_type>::type endIter(list& l) {
        return l.crend();
    }

    bool result;
};

#include <list>

namespace util {



mpw::Direction DirectionTestHelper::toDirection(char c) {

    std::list<int> ints;

    Foo<std::list<int>, std::list<int>::iterator> foo1(ints, ints.begin());
    Foo<std::list<int>, std::list<int>::const_iterator> foo2(ints, ints.cbegin());
    Foo<std::list<int>, std::list<int>::reverse_iterator> foo3(ints, ints.rbegin());
    Foo<std::list<int>, std::list<int>::const_reverse_iterator> foo4(ints, ints.crbegin());

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
