package Maksim.Tasks_60_80;

import java.util.Arrays;

public class Task_67 {
//    Combine arrays  int arr1[]={1,2,3};  int arr2[]={4,5,6,7};
//    int arr3[]={1,2,3,4,5,6,7};

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr3,0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        System.out.println(Arrays.toString(arr3));
    }
}
