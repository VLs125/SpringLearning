package com.example.demo;

public class Person {
    private Pet pet;
    private String surname;
    private int Age;



    public Person() {
        System.out.println("Person bean is created");
    }
    public int getAge() {
        System.out.println("Getting age");
        return Age;
    }

    public String getSurname() {
        System.out.println("Getting surname");
        return surname;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    public void setAge(int age) {
        System.out.println("Setting age");
        Age = age;
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
