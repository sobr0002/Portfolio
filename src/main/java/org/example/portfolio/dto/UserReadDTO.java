package org.example.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReadDTO {

    private int userId;
    private String firstName, lastName, email;
    private RoleDTO role;
    private List<ProjectReadDTO> projectList;


}
