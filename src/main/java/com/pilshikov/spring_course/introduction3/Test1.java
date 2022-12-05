package com.pilshikov.spring_course.introduction3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        inject object dependency with spring
        Person person = context.getBean("myPerson", Person.class);
        person.callMyPet();

        context.close();
    }
}
