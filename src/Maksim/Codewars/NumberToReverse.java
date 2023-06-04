package Maksim.Codewars;

import java.util.Arrays;

public class NumberToReverse {
    //https://www.codewars.com/kata/5583090cbe83f4fd8c000051
    public static int[] digitize(long n) {

        StringBuilder builder = new StringBuilder(String.valueOf(n)).reverse();
        int[] array = new int[builder.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(builder.substring(i,i+1));
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
    }
}