package com.company;

/**
 * Created by Piotr on 2017-04-05.
 */
public class string {
    public static void main(String[] args) {

        int myInt = 10;
        String text = "Hello";
        String space = " ";
        String name = "Piotr";

        String greeting = text + space + name;
        System.out.println(greeting);

        System.out.println("Hello" + " " + "Piotr");
        System.out.println("My integer is: " + myInt);

        double myDouble = 5.4;
        System.out.println("My number is: " + myDouble);

    }
}
