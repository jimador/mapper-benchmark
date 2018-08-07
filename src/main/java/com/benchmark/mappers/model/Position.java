package com.benchmark.mappers.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author James Dunnam
 */
public class Position implements Serializable {
    private String id;
    private String laborCategory;
    private String positionName;
    private Integer salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLaborCategory() {
        return laborCategory;
    }

    public void setLaborCategory(String laborCategory) {
        this.laborCategory = laborCategory;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(id, position.id) &&
                Objects.equals(laborCategory, position.laborCategory) &&
                Objects.equals(positionName, position.positionName) &&
                Objects.equals(salary, position.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, laborCategory, positionName, salary);
    }
}
