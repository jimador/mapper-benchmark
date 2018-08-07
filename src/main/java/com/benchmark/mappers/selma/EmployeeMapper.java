package com.benchmark.mappers.selma;

import com.benchmark.mappers.EmpMapper;
import com.benchmark.mappers.model.Contract;
import com.benchmark.mappers.model.Employee;
import com.benchmark.mappers.model.Manager;
import com.benchmark.mappers.model.Position;
import com.benchmark.mappers.model.Project;
import com.benchmark.mappers.model.dto.ContractDto;
import com.benchmark.mappers.model.dto.EmployeeDto;
import com.benchmark.mappers.model.dto.ManagerDto;
import com.benchmark.mappers.model.dto.PositionDto;
import com.benchmark.mappers.model.dto.ProjectDto;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

/**
 * @author James Dunnam
 */
@Mapper(withCustomFields = {
        @Field({"contract", "contractDto"}),
        @Field({"manager", "managerDto"}),
        @Field({"position", "positionDto"}),
        @Field({"project", "projectDto"})
}, withIgnoreMissing = IgnoreMissing.DESTINATION)
public interface EmployeeMapper extends EmpMapper {

    EmployeeDto map(Employee employee);

    ContractDto asContract(Contract contract);
    ManagerDto asManager(Manager manager);
    PositionDto asPosition(Position position);
    ProjectDto asProject(Project project);
}
