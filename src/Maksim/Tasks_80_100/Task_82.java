package Maksim.Tasks_80_100;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Task_82 {

    /*
    I need the solution for an array of size N
    Given an array {a1, a2, a3, … aN}
    New array should be { a2*a3*…aN, a1*a3…aN, … a1*a2…a(N-1)}
    For an example if N=4 and array we have is {2, 3 , 4, 5}
    New array is (3*4*5, 2*4*5, 2*3*5, 2*3*4} = {60, 40, 30, 24}
     */
    public static int[] transformArray(int[] arr) {
        int[] result = new int[arr.length];

        // Calculate the product of all elements to the right of each element
        int product = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = product;
            product *= arr[i];
        }
        // Multiply each element by the product of all elements to the left of it
        product = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] *= product;
            product *= arr[i];
        }
        return result;
    }

    public static int[] getArr(int[] arr) {

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    temp *= arr[j];
                }
            }
            result[i] = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(Arrays.toString(transformArray(arr)));
        System.out.println(Arrays.toString(getArr(arr)));
    }
}