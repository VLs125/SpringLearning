package com.example.demo;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat has been created");

    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
