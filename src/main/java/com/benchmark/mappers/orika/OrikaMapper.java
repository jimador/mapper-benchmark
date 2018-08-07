package com.benchmark.mappers.orika;

import com.benchmark.mappers.EmpMapper;
import com.benchmark.mappers.model.Employee;
import com.benchmark.mappers.model.dto.EmployeeDto;
import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * @author James Dunnam
 * @since 12.1
 */
public class OrikaMapper implements EmpMapper {

    private BoundMapperFacade<Employee, EmployeeDto> empMapper;

    public OrikaMapper() {
        MapperFactory factory = new DefaultMapperFactory.Builder().build();
        factory.registerClassMap(factory.classMap(Employee.class, EmployeeDto.class)
                .field("contract", "contractDto")
                .field("position", "positionDto")
                .field("manager", "managerDto")
                .field("project", "projectDto")
                .toClassMap());
        empMapper = factory.getMapperFacade(Employee.class, EmployeeDto.class, false);
    }

    @Override
    public EmployeeDto map(Employee employee) {
        return empMapper.map(employee);
    }
}
