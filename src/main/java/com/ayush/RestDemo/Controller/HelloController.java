package com.ayush.RestDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @RequestMapping("/")
        public String greet(){
        return "Hello World";

    }
}
