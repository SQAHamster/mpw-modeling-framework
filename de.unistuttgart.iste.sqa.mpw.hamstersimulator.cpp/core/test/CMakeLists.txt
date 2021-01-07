add_executable(example FirstSimpleTests.cpp HamsterCommandTest.cpp UndoCommandTest.cpp util/GameStringifier.cpp util/GameStringifier.h util/TestUtils.cpp util/TestUtils.h util/DirectionTestHelper.cpp util/DirectionTestHelper.h)
target_link_libraries(example hamster_core_lib gtest_main)
add_test(NAME example_test COMMAND example)
