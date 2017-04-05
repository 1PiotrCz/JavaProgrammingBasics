package com.company;

import java.util.Scanner;

/**
 * Created by Piotr on 2017-04-05.
 */
public class Switch {
    public static void main(String[] args) {

        Scanner scInput = new Scanner(System.in);

        System.out.println("Yoy can choose a command : start or stop ");
        System.out.println("Please enter a command: ");
        String text = scInput.nextLine();

        switch (text) {
            case "start":
                System.out.println("Machine started!");
                break;

            case "stop":
                System.out.println("Machine stopped.");
                break;

            default:
                System.out.println("Command not recognized");
        }


    }
}
