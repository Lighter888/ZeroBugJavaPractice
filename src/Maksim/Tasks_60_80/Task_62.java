package Maksim.Tasks_60_80;

import java.util.Arrays;

public class Task_62 {

    /*
    int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
    output should be this
    7 8 9 6 0 1 2 3 4 5
     */

    public static void main(String[] args) {

        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

        for (int[] array : numbers) {
            Arrays.sort(array);
            for (int num : array) {
                System.out.print(num + "\t");
            }
        }
    }
}
