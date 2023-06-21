package Dmitrii.InterviewTasks;

public class LargestNumberInArray {
    public static void main (String[] args){
        int[]arr = {12, 2, -4, 5, 2, -15, 150};
        System.out.println(largestNumber(arr));
    }
    public static int largestNumber(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-1];
    }
}
