include(CMakeListsImpl.cmake)
message("gen-src" ${IMPL_GEN_SRCS})
set(IMPL_SRCS ${IMPL_SRCS}
    "core/src/impl/CompositeCommandBase.cpp"
    "core/src/impl/CompositeCommandBase.h"
    ${IMPL_GEN_SRCS}
    PARENT_SCOPE)
    