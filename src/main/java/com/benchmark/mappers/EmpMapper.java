package com.benchmark.mappers;

import com.benchmark.mappers.model.Employee;
import com.benchmark.mappers.model.dto.EmployeeDto;

/**
 * @author James Dunnam
 * @since 12.1
 */
public interface EmpMapper {
    EmployeeDto map(Employee employee);
}
