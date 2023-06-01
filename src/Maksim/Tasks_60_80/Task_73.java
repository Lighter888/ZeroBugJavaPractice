package Maksim.Tasks_60_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_73 {

/*
    Create array int[] and ArrayList and store result into them and get this result
    Calculate each number of array:Ex 1+4,2+5,6+3
    input:
    int a[] = {1, 2, 3};// length 3
    int b[] = {4, 5, 6, 7, 8};// length 5

    output:
    int a[] = {1, 2, 3};// length 3
    int b[] = {4, 5, 6, 7, 8};// length 5
    [5,7,9,7,8]
*/
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8};

        Integer[] c = new Integer[b.length];

        for (int i = 0; i < b.length; i++) {
            if (i < a.length) {
                c[i] = b[i] + a[i];
            } else {
                c[i] = b[i];
            }
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(c));
        System.out.println(list);
    }
}
