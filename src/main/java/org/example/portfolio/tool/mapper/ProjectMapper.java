package org.example.portfolio.tool.mapper;

import org.example.portfolio.dto.ProjectCreateDTO;
import org.example.portfolio.dto.ProjectReadDTO;
import org.example.portfolio.dto.ProjectUpdateDTO;
import org.example.portfolio.model.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    // Entity til ReadDTO
    ProjectReadDTO toDTO(Project project);

    // CreateDTO til Entity
    Project toEntity(ProjectCreateDTO projectCreateDTO);

    // UpdateDTO til Entity
    Project toEntity(ProjectUpdateDTO projectUpdateDTO);



}
