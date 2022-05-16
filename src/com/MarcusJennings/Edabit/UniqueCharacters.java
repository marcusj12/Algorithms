package com.MarcusJennings.Edabit;

import java.util.HashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(countUnique("Apples","Family"));
    }

        public static int countUnique(String s1, String s2) {
            String combined = s1 + s2;
            String unique = "";

            HashSet<Character> set = new HashSet<Character>();

            for (int i = 0; i < combined.length(); i++) {
                set.add(combined.charAt(i));
            }
            return set.size();
        }
    }

