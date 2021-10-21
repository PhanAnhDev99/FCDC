package com.fpt.myweb.controller;

import com.fpt.myweb.dto.response.RoleRespose;
import com.fpt.myweb.entity.Role;
import com.fpt.myweb.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;
    @RequestMapping(value = "/getAllRole")
    public ResponseEntity<List<RoleRespose>> getAllRole(){
        List<Role> roles = roleRepository.findAll();
        List<RoleRespose> roleResposes1 = new ArrayList<>();
        for (Role role1 : roles){
            RoleRespose roleRespose = new RoleRespose();
            roleRespose.setId(role1.getId());
            roleRespose.setName(role1.getName());
            roleResposes1.add(roleRespose);
        }
        return new ResponseEntity<List<RoleRespose>>(roleResposes1, HttpStatus.OK);

    }
}
