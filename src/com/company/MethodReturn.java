package com.company;

/**
 * Created by Piotr on 2017-04-27.
 */

class Person3 {
    String name;
    int age;

    void speak() {
        System.out.println("My name is" + name);
    }

    int calculateYearsToretirement() {
        int yearsLeft = 70 - age;
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}

public class MethodReturn {
    public static void main(String[] args) {

        Person3 person3 = new Person3();

        person3.name = "Piotr";
        person3.age = 25;

        int age = person3.getAge();
        String name = person3.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

        int years = person3.calculateYearsToretirement();
        System.out.println("Years till retirements " + years);
    }
}
