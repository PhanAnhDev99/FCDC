package com.fpt.myweb.convert;

import com.fpt.myweb.dto.request.UserRequet;
import com.fpt.myweb.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConvert {
    public User convertToUser(UserRequet userRequet) {
        User user = new User();
        user.setName(userRequet.getName());
        user.setPassword(userRequet.getPassword());
        user.setGender(userRequet.getGender());
        user.setStartOfdatedate(userRequet.getStartOfDate());
        user.setEmail(userRequet.getEmail());
        user.setPhone(userRequet.getPhone());
        user.setAddress(userRequet.getAddress());
        user.setBirthOfdate(userRequet.getBirthOfdate());
        return user;
    }

    public UserRequet convertToUserRequest(User user) {
        UserRequet userRequet = new UserRequet();
        userRequet.setName(user.getName());
        userRequet.setPassword(user.getPassword());
        userRequet.setGender(user.getGender());
        userRequet.setStartOfDate(user.getStartOfdatedate());
        userRequet.setEmail(user.getEmail());
        userRequet.setPhone(user.getPhone());
        userRequet.setAddress(user.getAddress());
        userRequet.setBirthOfdate(user.getBirthOfdate());
        userRequet.setRole_id(user.getRoles().getId());
        userRequet.setVillage_id(user.getVillage().getId());
        return userRequet;
    }

}
