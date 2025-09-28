package org.example.portfolio.tool.mapper;

import org.example.portfolio.dto.UserCreateDTO;
import org.example.portfolio.dto.UserReadDTO;
import org.example.portfolio.dto.UserUpdateDTO;
import org.example.portfolio.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProjectMapper.class, RoleMapper.class})
public interface UserMapper {

    // Entity til ReadDTO
    UserReadDTO toDTO(User user);

    // CreateDTO til Entity
    User toEntity(UserCreateDTO userCreateDTO);

    // UpdateDTO til Entity
    User toEntity(UserUpdateDTO userUpdateDTO);


}
