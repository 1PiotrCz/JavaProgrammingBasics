package com.company;

/**
 * Created by Piotr on 2017-04-27.
 */

class ConstructorMachine {
    private String name;
    private int code;

    public ConstructorMachine() {
        this("Bob", 1);

        System.out.println("Constructor running!");
    }

    public ConstructorMachine(String name) {
        this(name, 0);

        System.out.println("Second constructor running");
    }

    public ConstructorMachine(String name, int code) {

        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
}

public class Constructor {
    public static void main(String[] args) {

        ConstructorMachine machine1 = new ConstructorMachine();

        ConstructorMachine machine2 = new ConstructorMachine("Andy");

        ConstructorMachine machine3 = new ConstructorMachine("Dog", 7);
    }

}