package Dmitrii.GroupTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;

public class Task_52 {

    public static void main (String[] args){
        Integer[] arr = {6,6,7,7,8,9,1};
        System.out.println("Unique number(s) is: " + SolutionTask_52 (arr));

    }

    public static String SolutionTask_52(Integer[] arr){

//        write a method that can print out the unique elements from an int array
//
//        Ex: {1,1,2,3,3} ==> 2
//        {6,6,7,7,8,9} ==> 8 9
//                --write a method that can print out the unique elements from a double array
//        Note: Apply method overloading


         String result = "";
         for(int i = 0; i < arr.length; i++){
             int uniqueValueCount = Collections.frequency(Arrays.asList(arr), arr[i]);
             if(uniqueValueCount==1){
                 result  += arr[i].toString() + ", ";
             }
         }
        return result;
    }
}
