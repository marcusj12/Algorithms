package com.MarcusJennings.Edabit;

public class ScoringSystem {
        public static int[] calculateScores(String str) {
            int	counterA = 0;
            int	counterB = 0;
            int	counterC = 0;
            int[] array = new int[3];

            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'A') {
                    counterA++;
                }  else if (str.charAt(i) == 'B'){
                    counterB++;
                } else if (str.charAt(i) == 'C'){
                    counterC++;
                }

            }
            array[0] = counterA;
            array[1] = counterB;
            array[2] = counterC;
            return array;
        }

    }

