package com.pilshikov.spring_course.introduction2;

import com.pilshikov.spring_course.introduction2.Pet;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow meow");
    }

    public Cat() {
        System.out.println("cat bean is created");
    }
}
