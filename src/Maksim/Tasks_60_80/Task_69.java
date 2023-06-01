package Maksim.Tasks_60_80;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task_69 {

//          int g[]={1,2,3};
//          int gg[]={4,5,6,7};
//          int h[]={8,9};
//          int dd[]={10,11};
//
//          output:
//          [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

    public static Integer[] concatenate(Integer[] ...arrays) {
        return Stream.of(arrays)
                .flatMap(Stream::of)
                .toArray(Integer[]::new);
    }

    public static void main(String[] args) {

        Integer[] g = {1, 2, 3};
        Integer[] gg = {4, 5, 6, 7};
        Integer[] h = {8, 9};
        Integer[] dd = {10, 11};

        System.out.println(Arrays.toString(concatenate(g,gg,h,dd)));
    }
}
