package com.example.demo.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class sampleController {

    @GetMapping("/sample")
    public String getTestSample(){
        return "테스트용";
    }
}
