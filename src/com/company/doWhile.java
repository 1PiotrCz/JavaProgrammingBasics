package com.company;

import java.util.Scanner;

/**
 * Created by Piotr on 2017-04-05.
 */
public class doWhile {
    public static void main(String[] args) {
        Scanner scScan = new Scanner(System.in);

        System.out.println("You have to guess the encoded number");

        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = scScan.nextInt();
        }
        while(value != 5);

        System.out.println("Got 5!");
    }
}
