package Dmitrii.InterviewPrep;

import java.util.Arrays;

public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {27, -2, 55, 4, -54};
        System.out.println(largestNumInArr(arr));
    }

    public static int largestNumInArr(int[] arr) {
//        // Easiest way
//        Arrays.sort(arr);
//        return arr[arr.length - 1];

        //Interview solution using collections
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[arr.length - 1];
    }
}
