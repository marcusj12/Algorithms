package com.MarcusJennings.Edabit;

import java.util.Arrays;

public class PerfectSquarePatch {
    public static void main(String[] args) {
        int [][] square = squarePatch(3);

        // n will determine the number of sub-arrays
        // n will determine the number of elements in each sub-array
        // n will determine the value of each element within each sub-array
    }

    public static int [][] squarePatch (int n) {

        int[][] squareArray = new int [n][n];

        for (int i = 0; i < squareArray.length; i++) {
            //System.out.println(Arrays.toString(squareArray[i]));
            for (int j = 0; j < squareArray[i].length; j++) {
                //System.out.println(squareArray[i][j]);
                squareArray[i][j] = n;
            }
        }
        return null;
    }
}
