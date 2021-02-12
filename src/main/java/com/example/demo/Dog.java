package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    private String name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    public Dog(){
        System.out.println("Dog is created");
    }
    @Override
    public void say(){
        System.out.println("Гав гав");
    }

    public void init(){
        System.out.println("Class dog: init method");

    }

    public void destroy(){
        System.out.println("Class dog : destroy method");
    }

}
