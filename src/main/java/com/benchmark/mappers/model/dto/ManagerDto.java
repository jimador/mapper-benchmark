package com.benchmark.mappers.model.dto;

import java.io.Serializable;


/**
 * A DTO for the Manager entity.
 * @author James Dunnam
 */
public class ManagerDto implements Serializable {
    private String firstName;
    private String lastName;

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
}
