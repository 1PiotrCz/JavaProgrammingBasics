package com.company;

/**
 * Created by Piotr on 2017-04-06.
 */
public class ArraysString {
    public static void main(String[] args) {

        String[] words = new String[5];

        words[0] = "Hello";
        words[1] = "I";
        words[2] = "am";
        words[3] = "Piotr";

        System.out.println(words[1]);

        String[] fruits ={"pear", "apple", "banana"};

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        int value = 0;

        String text = null;
        System.out.println(text);

        String[] texts = new String[2];
        System.out.println(texts[0]);



    }
}
