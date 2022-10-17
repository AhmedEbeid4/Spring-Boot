package com.test.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }
}
