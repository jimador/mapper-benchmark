package com.benchmark.mappers.mapstruct;

import com.benchmark.mappers.EmpMapper;
import com.benchmark.mappers.model.Employee;
import com.benchmark.mappers.model.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for the entity Applicant and its DTO ApplicantDTO.
 * @author James Dunnam
 */
@Mapper(uses = {
    PositionMapper.class,
    ContractMapper.class,
    ManagerMapper.class,
    ProjectMapper.class
})
public interface EmployeeMapper extends EmpMapper {

    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);

    @Mappings({
            @Mapping(source = "contract", target = "contractDto"),
            @Mapping(source = "position", target = "positionDto"),
            @Mapping(source = "manager", target = "managerDto"),
            @Mapping(source = "project", target = "projectDto")
    })
    EmployeeDto map(Employee applicant);
}
