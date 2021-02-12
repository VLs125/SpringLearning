package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private String age;
//
//@Autowired
//public Person(Pet pet){
//    System.out.println("Person bean is created");
//    this.pet = pet;
//}
    public Person() {
        System.out.println("Person bean is created");
    }
    public String getAge() {
        System.out.println("Getting age");
        return age;
    }

    public String getSurname() {
        System.out.println("Getting surname");
        return surname;
    }
    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void setAge(String age) {
        System.out.println("Setting age");
        this.age = age;
    }
    public void setSurname(String surname) {
        System.out.println("Setting surname");
        this.surname = surname;
    }

    public void callYourPet(){
        System.out.println("Come to me my pet");
        pet.say();
    }
}
