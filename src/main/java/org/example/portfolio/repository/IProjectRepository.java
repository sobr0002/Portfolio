package org.example.portfolio.repository;

import org.example.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<Project, Integer> {
}
