package Maksim.Tasks_0_20;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_12 {
    /*
  Remove zeros
  int[] arr = {1, 0, 0, 2, 0, 3, 49, 6, 5};
  ArrayList<Integer> list = new ArrayList<>();
     */

    public static void removeZeroFromArrayInt(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num != 0) {
                list.add(num);
            }
        }
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(newArr));
    }
    public static void main(String[] args) {

        removeZeroFromArrayInt(new int[]{1, 0, 0, 2, 0, 3, 49, 6, 5});
    }
}
