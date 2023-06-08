package Dmitrii.InterviewTasks;

import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] args)  {
        int[] array = {3,60,35,2,45,320,5};
        bubbleSort(array);
    }
    public static void bubbleSort(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length - i); j++){
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }}}
        System.out.println(Arrays.toString(arr));}
}
