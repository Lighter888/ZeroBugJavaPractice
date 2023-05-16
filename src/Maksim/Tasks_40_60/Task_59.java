package Maksim.Tasks_40_60;

import java.util.Arrays;

public class Task_59 {

    /*
       59
       String sentence = "Today is great day";
       Array [Today, is, great, day]
       reverse Array[Today, is, great, day] to >  day great is Today
    */

    public static String reverseStr(String sentence) {

        StringBuilder result = new StringBuilder();
        String[] arrayRes = sentence.split(" ");
        for (int i = arrayRes.length - 1; i >= 0; i--) {
            result.append(arrayRes[i]).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("Today is great day"));
    }
}
