package com.jeffreiljaustin.sample1.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffreiljaustin.sample1.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
