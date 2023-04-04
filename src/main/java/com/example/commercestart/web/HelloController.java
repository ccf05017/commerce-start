package com.example.commercestart.web;

import com.example.commercestart.domain.Customer;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/hello/customer")
    public String helloCustomerWithPath(@RequestParam Long id) {
        return "Hello, you request customer: ID=" + id;
    }

}
