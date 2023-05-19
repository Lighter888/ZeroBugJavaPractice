package Maksim.Tasks_20_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_37 {

    /*
    Store Array and ArrayList

    int [] arr = {1,4,8,0,3,11,26,2};

    output
    [1, 8, 3, 26]
     */
    public static void main(String[] args) {

        int[] arr = {1,4,8,0,3,11,26,2};

        List<Integer> list = new ArrayList<>();

        int[] newArr = new int[arr.length / 2];

        int i;
        int j;

        for (i = 0, j = 0; i < arr.length; i+=2, j++) {
            newArr[j] = arr[i];
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(newArr));
    }
}
