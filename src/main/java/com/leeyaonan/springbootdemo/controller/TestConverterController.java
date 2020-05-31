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
public class TestConverterController {

    @GetMapping("/test/1")
    public String testString2Date(@RequestParam("date") LocalDateTime date) {
        return date.toString();
    }

    @GetMapping("/test/2")
    public String testString2Array(@RequestParam("string") String[] strs) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strs) {
            stringBuffer.append(str).append(",");
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1);
    }

    @GetMapping("/test/3")
    public String testString2IntArray(@RequestParam("int") int[] ints) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i : ints) {
            stringBuffer.append(i).append(",");
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1);
    }
}
