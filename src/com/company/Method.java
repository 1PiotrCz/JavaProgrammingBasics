package com.company;

/**
 * Created by Piotr on 2017-04-27.
 */

class PersonM {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name);
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }
}

public class Method {
    public static void main(String[] args) {


        PersonM person1 = new PersonM();
        person1.name = "Piotr X";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        PersonM person2 = new PersonM();
        person2.name = "Sarah Y";
        person2.age = 33;
        person2.speak();
        person1.sayHello();

        System.out.println(person1.name);

    }

}
