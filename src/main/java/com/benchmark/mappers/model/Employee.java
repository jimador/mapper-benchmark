package com.benchmark.mappers.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An Employee.
 *
 * @author James Dunnam
 */
public class Employee implements Serializable {
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Position position;
    private Project project;
    private Contract contract;
    private Manager manager;
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();
    private List<Email> emails;

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
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
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(middleName, employee.middleName) &&
                Objects.equals(position, employee.position) &&
                Objects.equals(project, employee.project) &&
                Objects.equals(contract, employee.contract) &&
                Objects.equals(manager, employee.manager) &&
                Objects.equals(phoneNumbers, employee.phoneNumbers) &&
                Objects.equals(addresses, employee.addresses) &&
                Objects.equals(emails, employee.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, position, project, contract, manager, phoneNumbers, addresses, emails);
    }
}
