package com.MarcusJennings.Edabit;

public class MaxMinDifference {
    public static void main(String[] args) {

    }
    public static int differenceMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i] > min) {
                min = arr[i];
            } else if (arr[i] < max) {
                max = arr[i];
            }
        }

        return min-max;
    }
}

