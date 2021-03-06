package com.fpt.myweb.repository;

import com.fpt.myweb.entity.Role;
import com.fpt.myweb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findUsersByPhone(String phone);
    List<User> findByRoles(Role role);
    List<User> findByNameContaining(String text);
    User findByPhoneAndPassword(String phone , String pass);



}
