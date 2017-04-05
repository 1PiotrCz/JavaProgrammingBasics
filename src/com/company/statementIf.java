package com.company;

/**
 * Created by Piotr on 2017-04-05.
 */
public class statementIf {
    public static void main(String[] args) {

        System.out.println(6 == 6);
        System.out.println(1 != 11);
        System.out.println(2 < 7);
        System.out.println(15 > 100 );
        System.out.println("");

        int loop = 0;

        while(true){
            System.out.println("Looping" + loop);

            if(loop == 3){
                break;
            }
            loop++;
            System.out.println("Running ..");
        }

    }
}
