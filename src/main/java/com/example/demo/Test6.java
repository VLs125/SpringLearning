package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Person person = context.getBean("personBean", Person.class);
//
//        person.callYourPet();

        Pet petCat = context.getBean("catBean",Pet.class);

        Pet petDog = context.getBean("dogBean",Dog.class);

        Person person = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);


        person.setPet(petDog);

        person2.setPet(petCat);

        person.callYourPet();

        person2.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());




        context.close();
    }
}
