package Dmitrii.InterviewPrep;

import java.util.Arrays;

public class FindFirstTwoBiggestNumINArr {
    public static void main (String[]args){
        int [] arr = {-5, 12, 55, 44, -12};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);
    }
}
