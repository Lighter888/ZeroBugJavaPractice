package Dmitrii.GroupTasks.CodeWars;

import java.util.*;


public class Kata {

    public static int[] flattenAndSort(int[][] array) {
        List <Integer> arrList = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                arrList.add(array[i][j]);
            }
        }
        int[] result = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++ ){
            result[i] = arrList.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}
