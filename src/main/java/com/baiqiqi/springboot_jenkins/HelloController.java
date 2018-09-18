package com.baiqiqi.springboot_jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class HelloController {

    @GetMapping(value = "/hi")
    public String sayHello(){
        return "Hello from Spring Boot to Jenkins";
    }

    @GetMapping(value = "/hello")
    public String sayGood(){
        return "good morning";
    }
}
