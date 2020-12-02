package com.binarios.poc.dynamictable.repository;

import java.util.Optional;

import com.binarios.poc.dynamictable.model.Role;
import com.binarios.poc.dynamictable.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}