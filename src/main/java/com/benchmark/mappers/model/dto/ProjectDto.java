package com.benchmark.mappers.model.dto;

import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the Project entity.
 * @author James Dunnam
 */
public class ProjectDto implements Serializable {
    private String projectName;
    private String projectTitle;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectDto dto = (ProjectDto) o;
        return Objects.equals(projectName, dto.projectName) &&
                Objects.equals(projectTitle, dto.projectTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, projectTitle);
    }
}
