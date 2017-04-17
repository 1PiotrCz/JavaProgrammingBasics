package com.company;

class Person {

    String name;
    int age;
}

public class ClassesAndObject {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Peter X";
        person1.age = 15;

        Person person2 = new Person();
        person2.name = "Anna Y";
        person2.age = 22;

        System.out.println(person1.name);
    }
}
