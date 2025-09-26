package org.example.portfolio.repository;

import org.example.portfolio.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Integer, Role> {
}
