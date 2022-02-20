package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author enmm
 * @since 2022/2/20 15:19
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}
