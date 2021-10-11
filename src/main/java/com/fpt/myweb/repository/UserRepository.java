package com.fpt.myweb.repository;

import com.fpt.myweb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findUsersByPhone(String phone);


}
