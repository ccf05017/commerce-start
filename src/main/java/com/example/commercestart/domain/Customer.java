package com.example.commercestart.domain;

public class Customer {

    private Long id;
    private String name;
    private String job;


    Customer(Long id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
