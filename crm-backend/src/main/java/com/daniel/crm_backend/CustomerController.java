package com.daniel.crm_backend;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*") // Erlaubt Zugriff vom Frontend-Port
public class CustomerController {
    private List<Customer> customers = new ArrayList<>();

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer data) {
        // Erstellt ein neues Objekt mit deiner ID-Logik (TKD-001)
        Customer newCustomer = new Customer(data.getFirstname(), data.getLastname(), data.getEmail());
        customers.add(newCustomer);
        return newCustomer;
    }
}
