package com.fpt.myweb.controller;

import com.fpt.myweb.repository.NewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
@Autowired
    private NewRepository newRepository;

}
