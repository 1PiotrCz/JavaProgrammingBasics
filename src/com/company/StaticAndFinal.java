package com.company;

/**
 * Created by Piotr on 2017-04-27.
 */

class Things {
    public final static int YOUR_LUCKY_NUMBER = 7;

    public String name;
    public static String description;

    public static int count = 0;

    public int id;

    public Things() {

        id = count;

        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {

        Things.description = "I am a things";

        Things.showInfo();

        System.out.println("Before creating objects, count is: " + Things.count);

        Things things1 = new Things();
        Things things2 = new Things();

        System.out.println("After creating objects, count is: " + Things.count);

        things1.name = "Bob";
        things2.name = "Azor";

        things1.showName();
        things2.showName();

        System.out.println("PI: " + Math.PI);

        System.out.println("Your lucky number is: " + Things.YOUR_LUCKY_NUMBER);
    }

}
