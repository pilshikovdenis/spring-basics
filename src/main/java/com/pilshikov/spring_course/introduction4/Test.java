package com.pilshikov.spring_course.introduction4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

//        inject fields dependency with spring
//        hardcoded variant
        Person person = context.getBean("myPerson", Person.class);
        person.callMyPet();

//        using properties to store feilds
        Person person2 = context.getBean("myPerson2", Person.class);
        person2.callMyPet();


        context.close();
    }
}
