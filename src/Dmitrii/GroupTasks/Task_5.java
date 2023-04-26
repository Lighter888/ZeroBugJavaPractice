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

        ascendingOrder();
        descendingOrder();
        sortArray();
    }

    public static void ascendingOrder (){
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2,5, 4));

        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i+1; j < arrList.size(); j++) {
                Integer intI = arrList.get(i);
                Integer intJ = arrList.get(j);
                if (intI > intJ){
                    arrList.set(i, intJ);
                    arrList.set(j,intI );
                }
            }
        }
        System.out.println(arrList);
    }

    public static void descendingOrder(){
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 10, 50, 2, 4, 50, 10, 3, 2,5, 4));

        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i+1; j < arrList.size(); j++) {
                Integer intI = arrList.get(i);
                Integer intJ = arrList.get(j);
                if (intI < intJ){
                    arrList.set(i, intJ);
                    arrList.set(j,intI );
                }
            }
        }
        System.out.println(arrList);
    }

    public static void sortArray (){
        int [] arr = {1, 2, 3, 49, 6, 5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int element : arr){
            list.add(element);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                Integer intI = list.get(i);
                Integer intJ = list.get(j);
                if (intI > intJ){
                    list.set(i, intJ);
                    list.set(j,intI );
                }
            }
        }
        System.out.println(list);
       }
    }

