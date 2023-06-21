package Dmitrii.InterviewTasks;

import java.util.Arrays;

public class FindTwoMaxNumberInArray {
    public static void main (String[] args){
        int[] arr = {22, -4, 55, 13, -15, 350, 43};
        Arrays.sort(arr);
        int firstMaxNumber = arr.length-1;
        int secondMaxNumber = arr.length-2;
        System.out.println("First max number: " + firstMaxNumber + "\nSecond max number: " + secondMaxNumber);
    }
}
