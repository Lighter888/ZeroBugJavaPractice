package Maksim.Tasks_60_80;

import java.util.Arrays;

public class Task_64 {

    /*
     {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };
      output should be  0 1 2 3 4 5 6 7 8 9
     */

    public static void main(String[] args) {

        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

        for (int i = numbers.length - 1; i >= 0; i--) {
            Arrays.sort(numbers[i]);
            for (int num : numbers[i]) {
                System.out.print(num + "\t");
            }
        }
    }
}
