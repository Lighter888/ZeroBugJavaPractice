package Maksim.Tasks_40_60;

import java.util.Arrays;

public class Task_58 {

    /*
     Write a program that can return the average number from an array of integers
     ex:
     [10, 15, 5, 6]
     average: 9.0
     */

    public static void main(String[] args) {

        int[] arr = {10, 15, 5, 6, 10};
        double avg = 0;

        double avg1 = Arrays.stream(arr, 0, arr.length).average().getAsDouble();
        System.out.println(avg1);

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        System.out.println(avg/arr.length);
    }
}
