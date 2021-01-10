include_directories(.)

add_executable(hamstersimulator_tests
        FirstSimpleTests.cpp
        HamsterCommandTest.cpp
        InitHamsterCommandTest.cpp
        TerritoryBuilderTest.cpp
        UndoCommandTest.cpp
        LocationTest.cpp
        view/HamsterViewModelTest.cpp
        util/GameStringifier.cpp util/GameStringifier.h
        util/TestUtils.cpp util/TestUtils.h
        util/DirectionTestHelper.cpp util/DirectionTestHelper.h
        view/HamsterViewTestBase.cpp view/HamsterViewTestBase.h
        view/ViewModelStringifier.cpp view/ViewModelStringifier.h view/UserInputInterfaceFake.cpp view/UserInputInterfaceFake.h)
target_link_libraries(hamstersimulator_tests hamster_core_lib gtest_main)
add_test(NAME hamstersimulator_tests COMMAND hamstersimulator_tests)

# Copy resources
add_custom_command(TARGET hamstersimulator_tests PRE_BUILD
        COMMAND ${CMAKE_COMMAND} -E copy_directory
        ${CMAKE_SOURCE_DIR}/resources/ $<TARGET_FILE_DIR:hamstersimulator_tests>/resources)
