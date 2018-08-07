package com.benchmark.mappers;

import com.benchmark.mappers.model.Employee;
import com.benchmark.mappers.model.EmployeeFactory;
import com.benchmark.mappers.model.dto.EmployeeDto;
import com.benchmark.mappers.util.EmpTester;
import org.junit.Test;

/**
 * @author James Dunnam
 * @since 12.1
 */
public abstract class BaseMapperTest {
    private final EmpMapper mapper;
    private static final Employee FRED = EmployeeFactory.create();

    public BaseMapperTest(EmpMapper mapper) {
        this.mapper = mapper;
    }

    @Test
    public void testEmployeeMapper() {
        EmployeeDto dto = mapper.map(FRED);
        EmpTester.testEmployee(FRED, dto);
    }
}
