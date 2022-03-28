package com.cyrandote.blueprint.api.v1.mapper;

import com.cyrandote.blueprint.api.v1.dto.DesignDTO;
import com.cyrandote.blueprint.domain.Design;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DesignMapper {

    DesignMapper INSTANCE = Mappers.getMapper(DesignMapper.class);

    DesignDTO designToDesignDTO(Design design);

}
