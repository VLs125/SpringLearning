package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope
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

//    @PostConstruct
//    public void init(){
//        System.out.println("Class dog: init method");
//
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class dog : destroy method");
//    }

}
