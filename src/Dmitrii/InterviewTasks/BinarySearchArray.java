package Dmitrii.InterviewTasks;

import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args) {

        int arr[] = {50,10,40,30,20};
        int key = 30;
        int first = 0;
        int last=arr.length-1;
        binarySearch(arr, first, last, key);

        Integer[] numbers = {1, 3, 5, 9, 2, 12, 4};
        System.out.println("Index number of an Array is: " + binarySearch(numbers, 5));

        Character[] chars = {'d', 's', 'k', 'a', 'm'};
        System.out.println("Index character of an Array is: " + binarySearch(chars, 'm'));

    }

    // Example of Binary Search
    public static void binarySearch(int[] arr, int first, int last, int key){
        Arrays.sort(arr);
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
//*************************************************************************************
    // Also we can use ArrayList and Collections class ---> Collections.binarySearch
    // It is prepared methods from java developers
    public static int binarySearch(Object[] arrKey, Object indexKey) {
        // Before use binary search we should to sort an Array
        Arrays.sort(arrKey);
        System.out.println(Arrays.toString(arrKey));
        // Binary Search return the index of search element in Array
        int index = Arrays.binarySearch(arrKey, indexKey);
        return index;
    }
}
