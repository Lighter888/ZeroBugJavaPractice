package Maksim.Tasks_80_100;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task_83 {

    /*
    int[] arr = new int[] {6,-6,5,1,2,8};
    Remove all digits that less than 0 and also if that numbers match any number remove that number to
    example: -6 is less than 0 and also equals 6 . So output should be [5, 1, 2, 8]
     */
    public static void main(String[] args) {

        Integer[] arr = new Integer[] {6,-6,5,1,2,8,-2,-8,-8,-8,6};

        List<Integer> list = new ArrayList<>(List.of(arr));

        for (Integer num : arr) {
            if (num < 0) {
                list.remove(num);
                list.removeIf( x -> (x == -num));
            }
        }

        System.out.println(list);
    }
}
