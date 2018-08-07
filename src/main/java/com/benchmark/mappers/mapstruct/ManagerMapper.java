package com.benchmark.mappers.mapstruct;

import com.benchmark.mappers.EmpMapper;
import com.benchmark.mappers.model.Manager;
import com.benchmark.mappers.model.dto.ManagerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for the entity Manager and its DTO ManagerDTO.
 * @author James Dunnam
 */
@Mapper
public interface ManagerMapper extends EmpMapper {

    ManagerMapper MAPPER = Mappers.getMapper(ManagerMapper.class);

    ManagerDto map(Manager manager);

    Manager managerDTOToManager(ManagerDto managerDTO);
}
