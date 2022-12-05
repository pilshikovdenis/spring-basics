package com.pilshikov.spring_course.introduction2;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("person bean is created");
        this.pet = pet;
    }
    public void callMyPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
