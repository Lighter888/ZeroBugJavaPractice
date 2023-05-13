package Maksim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_4 {

    /*
     Use Collection int a [] = {2,5,7,15,1,6};
   int a [] = {2,5,7,15,1,6};
   output
   13   < Max number minus second min num and result is 13
     */

    public static int maxMinus2ndMin(int [] a) {

        List<Integer> list = new ArrayList<>();
        for (int i : a) {
            list.add(i);
        }
        Collections.sort(list);

        return list.get(list.size() - 1) - list.get(1);
    }
    public static void main(String[] args) {
        System.out.println(maxMinus2ndMin(new int[]{2, 5, 7, 15, 1, 6, 0, 4}));
    }

}
