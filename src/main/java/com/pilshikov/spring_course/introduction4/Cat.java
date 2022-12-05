package com.pilshikov.spring_course.introduction4;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow meow");
    }

    public Cat() {
        System.out.println("cat bean is created");
    }
}
