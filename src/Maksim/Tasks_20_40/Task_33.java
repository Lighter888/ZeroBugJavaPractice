package Maksim.Tasks_20_40;

import java.util.Arrays;

public class Task_33 {

    /*
        Given an int array length 3, if there is a 2 in the array
        immediately followed by a 3, set the 3 element to 0.
        Return the changed array.
        fix23([1, 2, 3]) → [1, 2, 0]
        fix23([2, 3, 5]) → [2, 0, 5]
        fix23([1, 2, 1]) → [1, 2, 1]
     */

    public static int[] convertArray(int[] fix23) {

        for (int i = 0; i < fix23.length - 1; i++) {
            if ((fix23[i] == 2) && (fix23[i + 1] == 3)) {
                fix23[i + 1] = 0;
            }
        }
        return fix23;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(convertArray(new int[] {1, 2, 1, 2, 3})));
    }
}
