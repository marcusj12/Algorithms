package com.MarcusJennings.Edabit;

public class SumOfArrayElements {
    public static int arraySum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];

        }
        return sum;
    }
}
