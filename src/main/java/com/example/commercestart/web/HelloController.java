package com.example.commercestart.web;

import com.example.commercestart.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String handleHello() {
        return "hello, spring";
    }

    @PostMapping("/hello/customer")
    public String helloCustomer(@RequestBody Customer customer) {
        return "Hello, " + customer.getName();
    }

}
