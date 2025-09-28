package org.example.portfolio.tool.mapper;

import org.example.portfolio.dto.RoleDTO;
import org.example.portfolio.model.Role;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTO toDTO(Role role);

    Role toEntity(RoleDTO roleDTO);


}
