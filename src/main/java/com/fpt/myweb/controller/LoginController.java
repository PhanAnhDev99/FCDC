package com.fpt.myweb.controller;

import com.fpt.myweb.dto.request.LoginRequest;
import com.fpt.myweb.dto.request.UserRequet;
import com.fpt.myweb.dto.response.LoginResponse;
import com.fpt.myweb.entity.User;
import com.fpt.myweb.exception.Dup;
import com.fpt.myweb.exception.Mes;
import com.fpt.myweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/l1")
public class LoginController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/login")
    public ResponseEntity<?> checkLogin(@RequestBody LoginRequest loginRequest) {
        User user = userRepository.findByUsernameAndPassword(loginRequest.getUsername(),loginRequest.getPassword());
        if(user==null){
            return new ResponseEntity<Mes>(new Mes("ko chộ"),HttpStatus.OK);
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUsername(user.getUsername());
        loginResponse.setPassword(user.getPassword());
        loginResponse.setRole_id(user.getRoles().getId());
        return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
    }
}
