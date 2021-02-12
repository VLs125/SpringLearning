package com.example.demo;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.example.demo")
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    @Scope("prototype")
    public Person personBean(){
        return new Person(catBean());
    }
    @Bean
    @Scope("prototype")
    public Pet dogBean(){
        return new Dog();
    }
}
