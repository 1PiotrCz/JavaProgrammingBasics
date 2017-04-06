package com.company;

/**
 * Created by Piotr on 2017-04-06.
 */
public class ArrayMultiDimension {
    public static void main(String[] args) {

        int [] vaules = {2,7,5,24,55};
        System.out.println(vaules[2]);

        int[][] grid = {
                {3, 5, 43},
                {2, 9},
                {5, 4, 3, 2}
        };

        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

    }
}
