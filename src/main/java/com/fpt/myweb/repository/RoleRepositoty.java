package com.fpt.myweb.repository;

import com.fpt.myweb.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositoty extends JpaRepository<Role,Long> {
}
