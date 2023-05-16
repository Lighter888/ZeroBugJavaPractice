package Maksim.Tasks_0_20;

import java.util.*;

public class Task_5 {
/*
    Don't use sort method
    ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
    first
    output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

    second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]

        ---------------SECOND------------
    Store into Array
2   int[] arr = {1, 2, 3, 49, 6, 5};
    ArrayList<Integer> list = new ArrayList();
 */

    public static ArrayList<Integer> bubbleSort_1(Integer[] arr) {
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(arr));
        int temp;
        for (Integer element: list) {
            for (int i = 0, j = 1; j < arr.length; i++, j++) {
                if (list.get(j) < list.get(i)) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        return list;
    }

    public static int[] bubbleSort_2(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i:arr) {
            list.add(i);
        }
        int temp;
        for (Integer element: list) {
            for (int i = 0, j = 1; j < arr.length; i++, j++) {
                if (list.get(j) < list.get(i)) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[] {1,10, 50, 2, 4, 50, 10, 3, 2,5, 4};

        int[] arr2 = {1, 2, 3, 49, 6, 5};

        System.out.println(bubbleSort_1(arr));
        System.out.println(Arrays.toString(bubbleSort_2(arr2)));
    }
}
