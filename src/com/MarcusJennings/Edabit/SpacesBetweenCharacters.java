package com.MarcusJennings.Edabit;

public class SpacesBetweenCharacters {
    public static void main(String[] args) {
        System.out.println(spaceMeOut("Hello"));
    }
    public static String spaceMeOut(String str) {
        return str.replaceAll(""," ").trim();

    }
}

