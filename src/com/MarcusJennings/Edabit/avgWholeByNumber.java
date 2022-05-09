package com.MarcusJennings.Edabit;

public class avgWholeByNumber {
    public static void main(String[] args) {
        //System.out.println(, isAvgWhole([2));
    }

        public static boolean isAvgWhole(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            return sum % arr.length == 0;
        }
    }

