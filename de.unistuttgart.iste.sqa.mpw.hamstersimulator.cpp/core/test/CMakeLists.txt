add_executable(example FirstSimpleTests.cpp)
target_link_libraries(example hamster_core_lib gtest_main)
add_test(NAME example_test COMMAND example)
