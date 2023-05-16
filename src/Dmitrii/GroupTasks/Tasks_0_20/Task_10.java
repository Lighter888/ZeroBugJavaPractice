package Dmitrii.GroupTasks.Tasks_0_20;

import java.util.Arrays;

public class Task_10 {
    //10 if ascend true


    public static void main(String[] args) {
        int[] numsAcs = {1, 2, 3, 4, 5, 6, 7};
        int[] numsWrong = {1, 2, 3, 2, 1, 6, 7};
        System.out.println("Array " + Arrays.toString(numsAcs)  +" with ascending number is: " +  ascendingNums(numsAcs));
        System.out.println("Array " + Arrays.toString(numsWrong)  +" with ascending number is: " +  ascendingNums(numsWrong));
    }

    public static boolean ascendingNums(int[] nums) {

        boolean isAscending = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[i + 1]) {
                isAscending = true;
            } else {
                isAscending = false;
                break;
            }
            if (i >= 5) {
                break;
            }
        }
        return isAscending;
    }
}
