package Maksim.Tasks_60_80;

import java.util.*;

public class Task_80 {

/*
    Write a function that receives an array of positive integers with values
    between and the length or the array. That function returns the number
    that most frequent array
    Integer arr[]={22,101,102,101,102,101,525,88,101,101,101};
    output 101
*/

    public static Integer getFrequentNum(Integer[] arr) {

        int count;
        int result = 0;
        int value = 0;

        for (Integer num : arr) {
            count = Collections.frequency(Arrays.asList(arr), num);
            if (count > result) {
                result = count;
                value = num;
            }
        }
        return value;
    }

    public static void main(String[] args) {

        Integer[] arr= {22,101,102,101,102,101,525,88,101,101,101,102,102,102,4,4,5,677,34,102,102};
        System.out.println(getFrequentNum(arr));

    }
}


