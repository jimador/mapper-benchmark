package com.benchmark.mappers.model.dto;

import com.benchmark.mappers.model.Address;
import com.benchmark.mappers.model.Email;
import com.benchmark.mappers.model.PhoneNumber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author James Dunnam
 */
public class EmployeeDto implements Serializable {
    private String id;
    private String firstName;
    private String lastName;
    private PositionDto positionDto;
    private ContractDto contractDto;
    private ManagerDto managerDto;
    private ProjectDto projectDto;
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();
    private List<Email> emails = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PositionDto getPositionDto() {
        return positionDto;
    }

    public void setPositionDto(PositionDto positionDto) {
        this.positionDto = positionDto;
    }

    public ContractDto getContractDto() {
        return contractDto;
    }

    public void setContractDto(ContractDto contractDto) {
        this.contractDto = contractDto;
    }

    public ManagerDto getManagerDto() {
        return managerDto;
    }

    public void setManagerDto(ManagerDto managerDto) {
        this.managerDto = managerDto;
    }

    public ProjectDto getProjectDto() {
        return projectDto;
    }

    public void setProjectDto(ProjectDto projectDto) {
        this.projectDto = projectDto;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDto dto = (EmployeeDto) o;
        return Objects.equals(id, dto.id) &&
                Objects.equals(firstName, dto.firstName) &&
                Objects.equals(lastName, dto.lastName) &&
                Objects.equals(positionDto, dto.positionDto) &&
                Objects.equals(contractDto, dto.contractDto) &&
                Objects.equals(managerDto, dto.managerDto) &&
                Objects.equals(projectDto, dto.projectDto) &&
                Objects.equals(phoneNumbers, dto.phoneNumbers) &&
                Objects.equals(addresses, dto.addresses) &&
                Objects.equals(emails, dto.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, positionDto, contractDto, managerDto, projectDto, phoneNumbers, addresses, emails);
    }
}
