package Maksim.Extra_Tasks;

import java.util.Arrays;

public class MaxMinValueOfArray {

    public static int maxArray(int[] array) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static int minArray(int[] array) {

        int mix = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (mix > array[i]) {
                mix = array[i];
            }
        }
        return mix;
    }

    public static int secMax(int[] array) {

        int maxIndex = 0;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (secondMax < array[i]) {
                secondMax = array[i];
                maxIndex = i;
                }
            }
        secondMax = Integer.MIN_VALUE;
        for (int i1 = 0; i1 < array.length; i1++) {
            if ( i1 != maxIndex && secondMax < array[i1]) {
                secondMax = array[i1];
                }
            }
        return secondMax;
    }

    public static int nMax(int[] arr, int n) {
        // handle negative case
        if (n > arr.length || n < 1) {
            return 0;
        }
        // sort array
        Arrays.sort(arr);

        // return n the biggest n value by using array length and n
        return arr[arr.length - n];
    }


    public static void main(String[] args) {

        System.out.println(maxArray(new int[] {4, 781, 8, 99, 103}));
        System.out.println(maxArray(new int[] {1, 2, 3, 4, 5}));

        System.out.println(minArray(new int[] {4, 781, 8, 99, 103}));
        System.out.println(minArray(new int[] {1, 2, 3, 4, 5}));

        System.out.println(secMax(new int[] {4, 781, 8, 99, 103})); // 103
        System.out.println(secMax(new int[] {1, 2, 3, 4, 5})); // 4
        System.out.println(secMax(new int[] {3, 4})); // 3

        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 1));
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 2));
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 3));
        System.out.println(nMax(new int[] {4, 3, 2, 8, 9, 5}, 100));

    }
}
