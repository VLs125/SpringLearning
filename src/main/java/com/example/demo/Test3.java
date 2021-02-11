package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet",Pet.class);
//
//
        Person vasiliy = context.getBean("myPerson",Person.class);
        vasiliy.callYourPet();

        System.out.println(vasiliy.getSurname());

        System.out.println(vasiliy.getAge());

        context.close();
    }
}
