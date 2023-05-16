package Dmitrii.GroupTasks.Tasks_61_80;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task_70 {

    public static void main(String[] args) {

//        //70 Store into Array
//        int a[]={1,3,5};
//        int b[]={2,4,6};
//        output
//                [1,2,3,4,5,6]

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        ArrayList<Integer> combinedInt = new ArrayList<>();
        // First for loop iterate array "a" and add every each element of an array to the ArrayList
        for (int i = 0; i < a.length; i++) {
            combinedInt.add(a[i]);
        }
        // Second for loop iterate array "b" and add every each element of an array to the ArrayList
        for (int i = 0; i < b.length; i++) {
            combinedInt.add(b[i]);
        }
        // Sort all elements of an ArrayList uses sorted method
        System.out.println(Arrays.toString(combinedInt.stream().sorted().toArray()));
    }
}
