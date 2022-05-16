package com.MarcusJennings.Edabit;

public class reverseAnArray {
    public static void main(String[] args) {
        reverse([1,2,3,4]);
    }
    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
       return reverse;
    }
}
}
