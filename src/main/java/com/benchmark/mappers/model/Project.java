package com.benchmark.mappers.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author James Dunnam
 */
public class Project implements Serializable {
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
        Project project = (Project) o;
        return Objects.equals(projectName, project.projectName) &&
                Objects.equals(projectTitle, project.projectTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectName, projectTitle);
    }
}
