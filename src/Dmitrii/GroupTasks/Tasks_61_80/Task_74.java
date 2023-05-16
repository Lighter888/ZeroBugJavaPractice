package Dmitrii.GroupTasks.Tasks_61_80;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_74 {
    public static void main(String[] args) {
//        //74
//        int[] arr = {5, 7, 3, 9, 1, 0};
//        int pivot = 8
//        In case we need to have pivot int inside the array the output should be: [5, 7, 3, 8, 9, 1, 0]

        int[] arr = {5, 7, 3, 9, 1, 0};
        int pivot = 8;
        LinkedList<Integer> arrList = new LinkedList<>();

        for (Integer element:arr) {
            if(element==pivot+1) {
                arrList.add(pivot);
                arrList.add(pivot+1);
            } else {
                arrList.add(element);
            }
        }
        System.out.println(arrList);
    }
}

