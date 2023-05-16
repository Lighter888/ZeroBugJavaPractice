package Maksim.Tasks_20_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_25 {

//    USE ITERATOR
//  ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
//
//  output
//  [1, 2, 3, 4, 5, 6, 7, 8, 9]

    public static List<Integer> sortListLess10(List<Integer> list){
        list.removeIf(num -> (num >= 10));
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,45,23,5,6,7,8,9,101,200,300));
        System.out.println(sortListLess10(list1));
    }

}
