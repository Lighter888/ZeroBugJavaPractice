package Maksim;

import java.util.Arrays;

public class Task_18 {

//
//    String divisibleBy15 ="";
//    String divisibleBy5 ="";
//    String divisibleBy3 ="";
//
//    int[] arr = new int[100];
//    Divisible By 15: 15 30 45 60 75 90
//    Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
//    Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99


    public static String getDivisible(int[] arr){

        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3 ="";

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i] % 15 == 0) {
                divisibleBy15 += arr[i] + " ";
            } else if (arr[i] % 5 == 0) {
                divisibleBy5 += arr[i] + " ";
            }else if (arr[i] % 3 == 0) {
                divisibleBy3 += arr[i] + " ";
            }
        }
        return  "Divisible By 15: " + divisibleBy15 +  "\nDivisible By 5: " + divisibleBy5 + "\nDivisible By 3: " + divisibleBy3;
    }

    public static void main(String[] args) {

        System.out.println(getDivisible(new int[100]));
    }
}
