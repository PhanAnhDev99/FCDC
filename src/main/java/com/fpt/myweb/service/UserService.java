package com.fpt.myweb.service;

import com.fpt.myweb.dto.UserRequet;

import java.util.List;

public interface UserService {
    //get all user
    public List<UserRequet> getAllUser();
    //get by id
    public UserRequet getUser(long id);
    //create new User
    public UserRequet addUser(UserRequet userRequet);
    //Delete User
    public UserRequet deleteUser(long id);
    public UserRequet edit(long id , UserRequet userRequet);




}
