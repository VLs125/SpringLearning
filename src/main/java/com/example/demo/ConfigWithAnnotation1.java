package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext3.xml");


        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
//        Cat myCat = context.getBean("cat", Cat.class);
//
//        myCat.say();

        context.close();
    }
}
