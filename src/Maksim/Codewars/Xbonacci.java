package Maksim.Codewars;

import java.util.Arrays;

public class Xbonacci {

    //https://www.codewars.com/kata/556deca17c58da83c00002db

    public static double[] tribonacci(double[] s, int n) {

        double[] arr = Arrays.copyOf(s, n);
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 10)));
    }
}

