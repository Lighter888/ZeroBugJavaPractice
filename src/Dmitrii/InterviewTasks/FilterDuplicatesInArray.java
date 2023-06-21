package Dmitrii.InterviewTasks;

import java.util.*;
public class FilterDuplicatesInArray {
    public static void main (String[] args){
        int [] arr = {1,2,2,3,3,3,4,5,5,5,5};
        List<String> arrList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int ch : arr) {
            if(!set.add(String.valueOf(ch))) {
                arrList.add(String.valueOf(ch));
            }
        }
        System.out.println("Returned duplicates elements is: " +arrList);
    }
}