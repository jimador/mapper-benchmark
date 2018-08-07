package com.benchmark.mappers.util;

import com.benchmark.mappers.model.Address;
import com.benchmark.mappers.model.Contract;
import com.benchmark.mappers.model.Email;
import com.benchmark.mappers.model.Employee;
import com.benchmark.mappers.model.Manager;
import com.benchmark.mappers.model.PhoneNumber;
import com.benchmark.mappers.model.Position;
import com.benchmark.mappers.model.Project;
import com.benchmark.mappers.model.dto.ContractDto;
import com.benchmark.mappers.model.dto.EmployeeDto;
import com.benchmark.mappers.model.dto.ManagerDto;
import com.benchmark.mappers.model.dto.PositionDto;
import com.benchmark.mappers.model.dto.ProjectDto;
import org.junit.Assert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author James Dunnam
 */
public final class EmpTester {

    private EmpTester(){}

    private static void testContract(Contract contract, ContractDto dto) {
        assertEquals(contract.getContractLaborCategory(), dto.getContractLaborCategory());
        assertEquals(contract.getContractName(), dto.getContractName());
        assertEquals(contract.getContractNumber(), dto.getContractNumber());
    }

    private static void testManager(Manager manager, ManagerDto dto) {
        assertTrue(manager.getFirstName().equalsIgnoreCase(dto.getFirstName()));
        assertTrue(manager.getLastName().equalsIgnoreCase(dto.getLastName()));

    }

    private static void testPosition(Position position, PositionDto dto) {
        assertTrue(position.getPositionName().equalsIgnoreCase(dto.getPositionName()));
        assertTrue(position.getLaborCategory().equalsIgnoreCase(dto.getLaborCategory()));
        assertTrue(position.getId().equalsIgnoreCase(dto.getId()));
        assertEquals(position.getSalary(), dto.getSalary());
    }

    private static void testProject(Project project, ProjectDto dto) {
        assertTrue(project.getProjectName().equalsIgnoreCase(dto.getProjectName()));
        assertTrue(project.getProjectTitle().equalsIgnoreCase(dto.getProjectTitle()));
    }

    public static void testAddress(Address lh, Address rh) {
        assertTrue(lh.getCity().equalsIgnoreCase(rh.getCity()));
        assertTrue(lh.getState().equalsIgnoreCase(rh.getCity()));
        assertTrue(lh.getStreet().equalsIgnoreCase(rh.getStreet()));
        assertTrue(lh.getZip().equalsIgnoreCase(rh.getZip()));
    }

    public static void testEmail(Email lh, Email rh) {
        assertTrue(lh.getEmail().equalsIgnoreCase(rh.getEmail()));
    }

    public static void testPhoneNumber(PhoneNumber lh, PhoneNumber rh) {
        assertTrue(lh.getPhoneNumber().equalsIgnoreCase(rh.getPhoneNumber()));
    }

    public static void testEmployee(Employee employee, EmployeeDto dto) {
        assertTrue(employee.getId().equalsIgnoreCase(dto.getId()));
        assertTrue(employee.getFirstName().equalsIgnoreCase(dto.getFirstName()));
        assertTrue(employee.getLastName().equalsIgnoreCase(dto.getLastName()));
        assertThat(employee.getPhoneNumbers()).containsAll(dto.getPhoneNumbers());
        assertThat(employee.getAddresses()).containsAll(dto.getAddresses());
        assertTrue(employee.getEmails().containsAll(dto.getEmails()));
        testManager(employee.getManager(), dto.getManagerDto());
        testContract(employee.getContract(), dto.getContractDto());
        testProject(employee.getProject(), dto.getProjectDto());
        testPosition(employee.getPosition(), dto.getPositionDto());

    }
}
