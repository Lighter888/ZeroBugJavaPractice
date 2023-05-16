package Maksim.Tasks_20_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_31 {

    //Given 2 arrays of ints, a and b, return true if
    //they have the same first element or they have the same last element.
    // Both arrays will be length 1 or more.

    //        int [] a = {1,2,3,4};
    //        int [] b = {1,2,3};

    public static boolean getArrayCompareOne (int[] a, int[] b) {
        return  ((a[0] == b[0]) || (a[a.length-1] == b[b.length-1]));
    }
    public static void main(String[] args) {
        System.out.println(getArrayCompareOne(new int[] {0, 2, 3, 4}, new int[] {1,2,4}));
    }
}
