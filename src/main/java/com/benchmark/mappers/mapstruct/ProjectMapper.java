package com.benchmark.mappers.mapstruct;

import com.benchmark.mappers.EmpMapper;
import com.benchmark.mappers.model.Project;
import com.benchmark.mappers.model.dto.ProjectDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for the entity Project and its DTO ProjectDTO.
 * @author James Dunnam
 */
@Mapper
public interface ProjectMapper extends EmpMapper {

    ProjectMapper MAPPER = Mappers.getMapper(ProjectMapper.class);

    ProjectDto map(Project project);

    Project projectDTOToProject(ProjectDto projectDTO);
}
