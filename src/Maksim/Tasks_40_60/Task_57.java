package Maksim.Tasks_40_60;

import java.util.*;

public class Task_57 {

    //            Given an array nums with 7 integers every element is repeated twice
    //            - except one. Find that element and print it to console.
    //            Example:
    //            nums -> [1, 1, 2, 3, 4, 3, 4]
    //            2

    public static int findUniqElem1(Integer[] arr) {
        int result = 0;
        List<Integer> listNum = new ArrayList<>(Arrays.asList(arr));

        for (Integer i : listNum) {
            int count = Collections.frequency(listNum, i);
            if (count == 1) {
                result = i;
            }
        }
        return result;
    }

    public static int findUniqElem2(int[] arr) {

        int result = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                result = arr[i];
            }
            count = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findUniqElem1(new Integer[] {1, 1, 2, 3, 4, 3, 4, 2, 7, 3, 2}));
        System.out.println(findUniqElem2(new int[] {1, 1, 2, 3, 4, 3, 4, 2, 7, 3, 2}));

    }
}
