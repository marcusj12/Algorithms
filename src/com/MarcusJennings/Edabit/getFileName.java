package com.MarcusJennings.Edabit;

public class getFileName {
    public static void main(String[] args) {
        getFilename("marc/is/handsome.txt");
    }
    public static String getFilename(String path) {
        String [] arr = path.split("/");
        return arr[arr.length -1];
    }
}
