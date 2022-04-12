package com.MarcusJennings.Edabit;

import javax.swing.*;
import java.net.Inet4Address;

public class NumericString {
    public static void main(String[] args) {
        System.out.println(add("12345","56742"));

    }
    public static String add(String a, String b) {
        try {
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            int sum = c + d;
            return String.valueOf(sum);
        } catch (Exception e) {
            return "Invalid Operation";
        }





    }
}
// = : assignment of a value
// == :
// When comparing two strings you will probably use .equals