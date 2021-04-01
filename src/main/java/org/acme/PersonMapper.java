package org.acme;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface PersonMapper {

    @Mapping(target = "surname", source = "lastname")
    PersonDto toResource(Person person);
}
