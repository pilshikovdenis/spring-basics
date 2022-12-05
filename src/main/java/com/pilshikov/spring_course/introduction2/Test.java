package com.pilshikov.spring_course.introduction2;

public class Test {


    public static void main(String[] args) {
        //    create objects without spring
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callMyPet();

        Pet pet1 = new Cat();
        Person person1 = new Person(pet1);
        person1.callMyPet();
    }
}
