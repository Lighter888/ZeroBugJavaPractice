package Dmitrii.GroupTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_5 {

//    Don't use sort method
//    ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
//    first
//            output
//[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]
//
//    second
//[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]
//
//        ---------------SECOND------------
//    Store into Array
//2int[] arr = {1, 2, 3, 49, 6, 5};
//    ArrayList<Integer> list = new ArrayList();
    public static void main (String[] args){
        solutionTaskFive ();
    }

    public static void solutionTaskFive(){
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2,5, 4));

        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i+1; j < arrList.size(); j++) {
                Integer tempIntI = arrList.get(i);
                Integer tempIntJ = arrList.get(j);
                if (tempIntI > tempIntJ){
                    arrList.set(i, tempIntJ);
                    arrList.set(j,tempIntI );
                }
            }
        }
        System.out.println(arrList);
    }
}
