package com.daniel.crm_backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CustomerController {

    @GetMapping("/greet")
    public ResponseEntity<String> hello(@RequestParam(value = "name") String name) {

        if(name.equals("admin")){
            return new ResponseEntity<String>("Hello " + name, HttpStatus.OK);
        } else{
            return new ResponseEntity<String>("Error", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/todo")
    public ResponseEntity<Todo> create(@RequestBody Todo newTodo) {
        return new ResponseEntity<Todo>(newTodo, HttpStatus.OK);
    }
    
    
}
