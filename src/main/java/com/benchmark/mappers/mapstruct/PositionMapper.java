package com.benchmark.mappers.mapstruct;

import com.benchmark.mappers.EmpMapper;
import com.benchmark.mappers.model.Position;
import com.benchmark.mappers.model.dto.PositionDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for the entity Position and its DTO PositionDTO.
 * @author James Dunnam
 */
@Mapper
public interface PositionMapper extends EmpMapper {

    PositionMapper MAPPER = Mappers.getMapper(PositionMapper.class);

    PositionDto map(Position position);

    Position positionDTOToPosition(PositionDto positionDTO);
}
