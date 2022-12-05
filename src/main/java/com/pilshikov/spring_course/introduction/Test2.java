package com.pilshikov.spring_course.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
//    create context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//    create objects using spring
        Pet pet = context.getBean("myDog", Pet.class);
        pet.say();

        Pet pet2 = context.getBean("myCat", Pet.class);
        pet2.say();


        context.close();
    }
}
