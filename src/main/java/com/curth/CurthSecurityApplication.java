package com.curth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CurthSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurthSecurityApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Get lost!";
    }

}
