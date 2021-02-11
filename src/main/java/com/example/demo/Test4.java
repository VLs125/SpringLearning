package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml"); // определение конфигурации
        //через XML

        Dog myDog = context.getBean("myPet", Dog.class);


        Dog yourDog = context.getBean("myPet", Dog.class); // создание объека (получение бина)
//        yourDog.setName("Твоя собака");
//        myDog.setName("МОя собака");
//
//        System.out.println(yourDog.getName());
//        System.out.println(myDog.getName());



//        System.out.println(myDog.equals(yourDog));
//
//        context.close();

    }
}
