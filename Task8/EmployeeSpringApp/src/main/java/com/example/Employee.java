package com.example;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int id = 101;
    private String name = "John";

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}