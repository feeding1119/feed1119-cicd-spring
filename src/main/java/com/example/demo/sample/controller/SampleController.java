package com.example.demo.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/sample")
    public String getTestSample(){
        userRepository.save(new User());
        return "테스트용1";
    }
}
