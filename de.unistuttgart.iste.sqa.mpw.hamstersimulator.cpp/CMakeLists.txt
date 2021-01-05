cmake_minimum_required(VERSION 3.17)
project(de_unistuttgart_iste_sqa_mpw_hamstersimulator_cpp)

set(CMAKE_CXX_STANDARD 17)

add_subdirectory(core/src/generated)
add_subdirectory(core/src/impl)
add_subdirectory(core/src/framework)
set(SRCS ${GEN_SRCS} ${IMPL_SRCS} ${FRAMEWORK_SRCS})

include_directories(core/src/generated)
include_directories(core/src/impl)
include_directories(core/src/framework)
add_library(hamster_core SHARED ${SRCS})
add_library(hamster_core_lib STATIC ${SRCS})

## Setup GTEST

enable_testing()

## from: https://github.com/google/googletest/tree/master/googletest#incorporating-into-an-existing-cmake-project

# Download and unpack googletest at configure time
configure_file(CMakeLists.txt.in googletest-download/CMakeLists.txt)
execute_process(COMMAND ${CMAKE_COMMAND} -G "${CMAKE_GENERATOR}" .
        RESULT_VARIABLE result
        WORKING_DIRECTORY ${CMAKE_CURRENT_BINARY_DIR}/googletest-download )
if(result)
    message(FATAL_ERROR "CMake step for googletest failed: ${result}")
endif()
execute_process(COMMAND ${CMAKE_COMMAND} --build .
        RESULT_VARIABLE result
        WORKING_DIRECTORY ${CMAKE_CURRENT_BINARY_DIR}/googletest-download )
if(result)
    message(FATAL_ERROR "Build step for googletest failed: ${result}")
endif()

# Prevent overriding the parent project's compiler/linker
# settings on Windows
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)

# Add googletest directly to our build. This defines
# the gtest and gtest_main targets.
add_subdirectory(${CMAKE_CURRENT_BINARY_DIR}/googletest-src
        ${CMAKE_CURRENT_BINARY_DIR}/googletest-build
        EXCLUDE_FROM_ALL)

# The gtest/gtest_main targets carry header search path
# dependencies automatically when using CMake 2.8.11 or
# later. Otherwise we have to add them here ourselves.
if (CMAKE_VERSION VERSION_LESS 2.8.11)
    include_directories("${gtest_SOURCE_DIR}/include")
endif()

add_subdirectory(core/test)
