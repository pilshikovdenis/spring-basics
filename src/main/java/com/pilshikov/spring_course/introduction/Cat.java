package com.pilshikov.spring_course.introduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow meow");
    }
}
