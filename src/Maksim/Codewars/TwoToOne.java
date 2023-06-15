package Maksim.Codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {

    //https://www.codewars.com/kata/5656b6906de340bd1b0000ac/

    public static String longest(String s1, String s2) {

        String s = s1 + s2;

        s = s.chars()
                .sorted()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        return s;
    }
    public static void main(String[] args) {

        System.out.println(longest("aretheyhere", "yestheyarehere"));
    }
}