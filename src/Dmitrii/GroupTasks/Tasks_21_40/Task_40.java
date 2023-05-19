package Dmitrii.GroupTasks.Tasks_21_40;

import java.util.ArrayList;

public class Task_40 {
//    //40  FIND missing numbers
//
//    int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
    public static void main(String[] args){
        ArrayList<Integer> missedNum = new ArrayList<>();
        int arr [] = {-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        for(int i = 0; i < arr.length; i++){
            if(i==arr.length-1){
                break;
            }  else if(arr[i]+1 != arr[i+1]){
                int iteration = arr[i+1]-arr[i];
                for(int j=1; j < iteration; j++){
                    missedNum.add(arr[i]+j);
                }
            }
        }
        System.out.println(missedNum);
    }
}
