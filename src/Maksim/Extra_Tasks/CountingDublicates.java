package Maksim.Extra_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingDublicates {

//    https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
    public static int duplicateCount(String text) {
//        List<String> list = Arrays.asList(text.toLowerCase().split(""));  Better solution
        List<String> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            list.add(text.toLowerCase().charAt(i) + "");
        }
        return (int) list.stream().filter(x -> Collections.frequency(list, x) >= 2).distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("aAbbcde" ));
    }
}































//    //        List<String> list = Arrays.asList(text.toLowerCase().split(""));  Better solution
//    List<String> list = new ArrayList<>();
//        for (int i = 0; i < text.length(); i++) {
//        list.add(text.toLowerCase().charAt(i) + "");
//        }
//        return (int) list.stream().filter(x -> Collections.frequency(list, x) >= 2).distinct().count();
//        }