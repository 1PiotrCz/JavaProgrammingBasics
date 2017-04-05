package com.company;

/**
 * Created by Piotr on 2017-04-05.
 */
public class Arrays {
    public static void main(String[] args) {

        int[] values;
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 7;
        values[1] = 20;
        values[2] = 18;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {7,6,5};

        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
