package Maksim.Codewars;

import java.util.Arrays;

public class SumOfArraySingles {

    //https://www.codewars.com/kata/59f11118a5e129e591000134

    public static int repeats(int[] arr) {

        int sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = 0;
                arr[i + 1] = 0;
            }
            sum += arr[i];
        }
        return sum + arr[arr.length-1];
    }

    public static void main(String[] args) {
        System.out.println(repeats(new int[]{4, 5, 7, 5, 4, 8}));
    }
}
