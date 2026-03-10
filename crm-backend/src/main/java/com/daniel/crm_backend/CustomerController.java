package com.daniel.crm_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/greet")
    public String hello() {
        return "Hello World";
    }
    
}
