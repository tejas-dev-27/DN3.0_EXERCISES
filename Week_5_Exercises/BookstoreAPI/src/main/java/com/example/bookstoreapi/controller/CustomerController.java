package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    // Endpoint to create a new customer by accepting a JSON request body
    @PostMapping
    public Customer registerCustomer(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String password) {
        Customer customer = new Customer(null, name, email, password);
        return customer;  // For demonstration, just return the customer object
    }
}
