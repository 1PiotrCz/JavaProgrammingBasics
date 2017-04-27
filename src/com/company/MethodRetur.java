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

    String getName(){
        return name;
    }

}

public class MethodRetur {
    public static void main(String[] args) {

    }
}
