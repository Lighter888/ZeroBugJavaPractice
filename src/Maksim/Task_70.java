package Maksim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_70 {

    //        Store into Array
    //        int a[]={1,3,5};
    //        int b[]={2,4,6};
    //        output
    //        [1,2,3,4,5,6]


    public static int[] storeArray_1(int[] a, int[] b){  // does not sort array from low to high int
        int[] result = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            result[i] = a[i];
            }
        for (int j = 0; j < b.length; j++) {
            result[j+i] = b[j];
        }
        return result;
    }
    public static Integer[] storeArray_2(int[] a, int[] b){
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            listResult.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            listResult.add(b[i]);
        }
        Collections.sort(listResult);
//        Collections.sort(listResult, Collections.reverseOrder()); //reverse order

        return listResult.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] a={1,3,5,7,5};
        int[] b={2,4,6};
        System.out.println(Arrays.toString(storeArray_1(a, b)));
        System.out.println(Arrays.toString(storeArray_2(a, b)));
    }
}
