package com.benchmark.mappers.model;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author James Dunnam
 * @since 12.1
 */
public final class EmployeeFactory {

    private EmployeeFactory() {

    }

    public static List<Employee> create(int num) {
        List<Employee> employees = new ArrayList<>();
        for(int i =0; i < num; i++) {
            employees.add(create());
        }

        return Collections.unmodifiableList(employees);
    }

    public static Employee create() {
        Faker faker = new Faker();
        Employee employee = new Employee();

        employee.setId(faker.number().toString());
        employee.setFirstName(faker.name().firstName());
        employee.setLastName(faker.name().lastName());
        employee.setMiddleName(faker.name().username());
        employee.setPosition(createPosition());
        employee.setProject(createProject());
        employee.setContract(createContract());
        employee.setManager(createManager());
        employee.setPhoneNumbers(createPhoneNumbers(2));
        employee.setAddresses(createAddresses(5));
        employee.setEmails(createEmails(5));

        return employee;
    }

    private static List<Address> createAddresses(int times) {
        List<Address> addresses = new ArrayList<>();
        for(int i = 0; i < times; i++) {
            addresses.add(createAddress());
        }

        return addresses;
    }

    private static Address createAddress() {
        Faker faker = new Faker();
        Address address = new Address();
        address.setCity(faker.address().city());
        address.setState(faker.address().state());
        address.setStreet(faker.address().streetAddress());
        address.setZip(faker.address().zipCode());

        return address;
    }

    private static Contract createContract() {
        Faker faker = new Faker();
        Contract contract = new Contract();
        contract.setContractName(faker.company().name());
        contract.setContractLaborCategory(faker.hacker().adjective());
        contract.setContractNumber(faker.idNumber().invalid());
        return contract;
    }

    private static List<Email> createEmails(int times) {
        List<Email> emails = new ArrayList<>();
        for(int i = 0; i < times; i++) {
            emails.add(createEmail());
        }

        return emails;
    }

    private static Email createEmail() {
        Faker faker = new Faker();
        Email email = new Email();
        email.setEmail(faker.internet().emailAddress());

        return email;
    }

    private static Manager createManager() {
        Faker faker = new Faker();
        Manager manager = new Manager();
        manager.setFirstName(faker.name().firstName());
        manager.setLastName(faker.name().lastName());

        return manager;
    }

    private static List<PhoneNumber> createPhoneNumbers(int times) {
        List<PhoneNumber> emails = new ArrayList<>();
        for(int i = 0; i < times; i++) {
            emails.add(createPhoneNumber());
        }

        return emails;
    }

    private static PhoneNumber createPhoneNumber() {
        Faker faker = new Faker();
        PhoneNumber phoneNumber = new PhoneNumber();

        phoneNumber.setPhoneNumber(faker.phoneNumber().phoneNumber());

        return phoneNumber;
    }

    private static Position createPosition() {
        Faker faker = new Faker();
        Position position = new Position();
        position.setLaborCategory(faker.hacker().noun());
        position.setId(faker.idNumber().invalid());
        position.setSalary(faker.number().numberBetween(0, 10000000));
        position.setPositionName(faker.company().catchPhrase());

        return position;
    }

    private static Project createProject() {
        Faker faker = new Faker();
        Project project = new Project();
        project.setProjectName(faker.commerce().productName());
        project.setProjectTitle(faker.cat().breed());

        return project;
    }

}
