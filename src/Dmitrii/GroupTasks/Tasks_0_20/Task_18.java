package Dmitrii.GroupTasks.Tasks_0_20;

import java.util.Arrays;
import java.util.Scanner;

public class Task_18 {

    public static void main(String[] args){

          String divisibleByNum ="";

        Scanner scan = new Scanner(System.in);
        int division = scan.nextInt();

        int[] arr = new int[100];
        for (int i=0; i<arr.length; i++){
            arr[i] = i+1;
            if(arr[i]%division==0){
                divisibleByNum +=  arr[i] + ", ";
            }

        }
        System.out.println(divisibleByNum);

    }
}
