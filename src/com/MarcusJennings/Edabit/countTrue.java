package com.MarcusJennings.Edabit;

public class countTrue {
    public static void main(String[] args) {
        System.out.println(countTrue(new boolean[]{true, false, true, true})) ;
    }
    public static int countTrue(boolean[] arr) {
        int counter = 0;
        for (int i =0; i < arr.length; i++){
            if (arr[i] == true) counter++;
        }
        return counter;

    }


}
