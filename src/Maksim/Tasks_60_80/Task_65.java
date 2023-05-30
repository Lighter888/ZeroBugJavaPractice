package Maksim.Tasks_60_80;

import java.util.Arrays;

public class Task_65 {

    /*
    String[] arr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};
    by using sort Array get max and min number
     */

    public static void main(String[] args) {

        String[] arr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};

        Arrays.sort(arr);
        System.out.println("Min = " + arr[0]);
        System.out.println("Max = " + arr[arr.length-1]);
    }
}
