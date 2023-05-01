package Dmitrii.GroupTasks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupTask_5 {
    //    Don't use sort method
//    ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2, 5, 4));
//    first
//            output
//[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]
//
//    second
//[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]

    public static void main(String[] args) {
        asc();
        desc();
    }

    public static void asc() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2, 5, 4));
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void desc() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2, 5, 4));
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
    }
}










