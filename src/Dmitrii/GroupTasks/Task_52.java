package Dmitrii.GroupTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;

public class Task_52 {

    public static void main(String[] args) {

        //        write a method that can print out the unique elements from an int array
//
//        Ex: {1,1,2,3,3} ==> 2
//        {6,6,7,7,8,9} ==> 8 9
//        --write a method that can print out the unique elements from a double array
//        Note: Apply method overloading


        Integer[] arr1 = {6, 6, 7, 7, 8, 9, 1};
        Integer[][] arr2 = {{1, 1, 2, 3, 3},
                {6, 6, 7, 7, 8, 9}};

        System.out.println("Unique number(s) from array is: " + SolutionTask_52(arr1));
        System.out.println("Unique number(s) from multidimensional array is: " + SolutionTask_52(arr2));

    }

    public static String SolutionTask_52(Integer[] arr1) {
        String result = "";
        for (int i = 0; i < arr1.length; i++) {
            int uniqueValueCount = Collections.frequency(Arrays.asList(arr1), arr1[i]);
            if (uniqueValueCount == 1) {
                result += arr1[i].toString() + ", ";
            }
        }
        return result;
    }

    public static String SolutionTask_52(Integer[][] arr2) {
        String result = "";
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {
                int uniqueValueCount = Collections.frequency(Arrays.asList(arr2[i]), arr2[i][j]);
                if (uniqueValueCount == 1) {
                    result += arr2[i][j].toString() + ", ";
                }
            }
        }
        return result;
    }
}
