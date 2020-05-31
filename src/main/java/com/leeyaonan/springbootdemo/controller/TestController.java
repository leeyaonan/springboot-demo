package com.leeyaonan.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Author leeyaonan
 * @Date 2020/5/31 15:22
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String testConverter(@RequestParam("date") LocalDateTime date) {
        return date.toString();
    }
}
