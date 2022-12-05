package com.pilshikov.spring_course.introduction4;

public class Dog implements Pet {
    public  void say() {
        System.out.println("Bow bow");
    }

    public Dog() {
        System.out.println("dog bean is created");
    }
}
