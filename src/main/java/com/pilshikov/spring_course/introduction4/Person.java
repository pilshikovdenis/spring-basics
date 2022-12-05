package com.pilshikov.spring_course.introduction4;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public void setPet(Pet pet) {
        System.out.println("Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Person: set age");
        this.age = age;
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
