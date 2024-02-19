package Dmitrii.FromRealInterview.FidelityVendor;

import java.util.Arrays;

public class SecondTask {
   // How to rotate array elements one position left  1,2,3,4,5 5   to   2,3,4,5,1
    public static void main (String[] args){
        int [] nums = {1, 2, 3, 4, 5};
        int temp = 0;
        for (int i = 0; i < nums.length-1; i++){
            temp = nums[i+1];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        nums [nums.length-1] = 1;
        System.out.println(Arrays.toString(nums));
    }
}
