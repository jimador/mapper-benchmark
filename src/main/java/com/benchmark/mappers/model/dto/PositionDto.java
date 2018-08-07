package com.benchmark.mappers.model.dto;

import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the Position entity.
 * @author James Dunnam
 */
public class PositionDto implements Serializable {
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
        PositionDto dto = (PositionDto) o;
        return Objects.equals(id, dto.id) &&
                Objects.equals(laborCategory, dto.laborCategory) &&
                Objects.equals(positionName, dto.positionName) &&
                Objects.equals(salary, dto.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, laborCategory, positionName, salary);
    }
}
