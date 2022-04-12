package com.MarcusJennings.Edabit;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println(triArea(4,5));
    }
    public static int triArea(int base, int height) {
        int area = (base * height) / 2;
        return area;
    }

}
