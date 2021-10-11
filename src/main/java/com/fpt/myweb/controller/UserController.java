package com.fpt.myweb.controller;

import com.fpt.myweb.dto.UserRequet;
import com.fpt.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // get all
    @GetMapping("/all")// fomat sang DTO trả về dữ liệu
    public ResponseEntity<List<UserRequet>> getAll() {
        List<UserRequet> userRequets = userService.getAllUser();
        return new ResponseEntity<List<UserRequet>>(userRequets, HttpStatus.OK);
    }

    //Add new user
    @PostMapping("/add")
    public ResponseEntity<UserRequet> addUsers(@RequestBody UserRequet userRequet) {
        UserRequet userRequet1 = userService.addUser(userRequet);
        return new ResponseEntity<UserRequet>(userRequet1, HttpStatus.OK);
    }

    // Update
    @PutMapping(value = "/edit")
    public ResponseEntity<UserRequet> edit(@RequestParam("id") long id, @RequestBody UserRequet userRequet) {
        UserRequet userRequet1 = userService.edit(id, userRequet);
        return new ResponseEntity<UserRequet>(userRequet1, HttpStatus.OK);
    }

    // Delete
    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<UserRequet> remove(@PathVariable("id") long id) {
        UserRequet userRequet = userService.deleteUser(id);
        return new ResponseEntity<UserRequet>(userRequet, HttpStatus.OK);
    }

    // getOne
    @GetMapping(value = "/get/{id}")
    public UserRequet getUser1(@PathVariable("id") long id) {
        return userService.getUser(id);
    }

}
