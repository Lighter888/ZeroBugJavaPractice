package Maksim.Tasks_60_80;

import java.util.Arrays;
import java.util.Collections;

public class Task_68 {

//        input         int[] numbs = {1,2,4,0,0,5,0};
//        output        [5, 4, 2, 1, 0, 0, 0]

    public static void main(String[] args) {

        Integer[] numbs = {1,2,4,0,0,5,0};
        Arrays.sort(numbs, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbs));
    }
}
