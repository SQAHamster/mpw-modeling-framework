#ifndef DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_REFLECTIVEPROPERTYOBJECT_H
#define DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_REFLECTIVEPROPERTYOBJECT_H

#include "Any.h"
#include <string>

/// \brief Base class which bring a simply support of reflective modifications.
/// \note the effective reflective logic is part of generated code in subclasses.
class ReflectivePropertyObject {

public:

    virtual ~ReflectivePropertyObject() = default;

    virtual void setProperty(const std::string& propertyName, Any value) = 0;
    virtual void addToCollection(const std::string& propertyName, EntityReference reference) = 0;
    virtual void removeFromCollection(const std::string& propertyName, EntityReference reference) = 0;

};

#endif //DE_UNISTUTTGART_ISTE_SQA_MPW_HAMSTERSIMULATOR_CPP_REFLECTIVEPROPERTYOBJECT_H
