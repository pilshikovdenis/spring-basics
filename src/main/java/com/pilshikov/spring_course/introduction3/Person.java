package com.pilshikov.spring_course.introduction3;

public class Person {
    private Pet pet;

    public void setPet(Pet pet) {
        System.out.println("Person: set pet");
        this.pet = pet;
    }

    public Person(Pet pet) {
        System.out.println("person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("person bean is created");
    }

    public void callMyPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
