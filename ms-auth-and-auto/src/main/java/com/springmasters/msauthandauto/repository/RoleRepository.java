package com.springmasters.msauthandauto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springmasters.msauthandauto.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
    
}
