package Maksim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_74 {

    //        int[] arr = {5, 7, 3, 9, 1, 0};
    //        int pivot = 8
    //        In case we need to have pivot int inside the array the output should be: [5, 7, 3, 8, 9, 1, 0]

    public static Integer[] addNumInToArray(int[] arr, int pivot) {

        List<Integer> resultNum = new ArrayList<>();
        for (int num: arr) {
            if (num == pivot + 1) {
            resultNum.add(pivot);
            resultNum.add(num);
            } else {
                resultNum.add(num);
            }
        }
        return resultNum.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 1, 0, 9};
        int pivot = 8;
        System.out.println(Arrays.toString(addNumInToArray(arr, pivot)));
    }
}


