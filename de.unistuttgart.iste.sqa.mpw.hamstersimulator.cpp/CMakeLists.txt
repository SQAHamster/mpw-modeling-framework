cmake_minimum_required(VERSION 3.17)
project(de_unistuttgart_iste_sqa_mpw_hamstersimulator_cpp)

set(CMAKE_CXX_STANDARD 20)

add_subdirectory(core/src/generated)
set(SRCS ${GEN_SRCS})

add_library(de_unistuttgart_iste_sqa_mpw_hamstersimulator_cpp SHARED ${SRCS})
