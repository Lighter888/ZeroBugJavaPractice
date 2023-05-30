package Maksim.Tasks_40_60;

import java.util.Arrays;

public class Task_55 {

    /*
    int[] arr11 = {200, 155, 100, 4, 3, 1, -1, -100};
    convert it ascending array and print like this
    [-100, -1, 1, 3, 4, 100, 155, 200]
     */

    public static void main(String[] args) {

        int[] arr = {200, 155, 100, 4, 3, 1, -1, -100};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
