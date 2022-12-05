package com.pilshikov.spring_course.introduction2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
//        create objects using spring dependency injection
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callMyPet();

        context.close();
    }
}
