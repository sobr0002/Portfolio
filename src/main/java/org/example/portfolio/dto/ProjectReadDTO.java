package org.example.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectReadDTO {
    private int projectId;
    private String title, description, pictureUrl, githubLink;
}
