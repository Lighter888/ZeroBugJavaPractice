package Maksim.Codewars;

import java.util.*;

public class CountCharsInYourString {
//    https://www.codewars.com/kata/52efefcbcdf57161d4000091
    public static Map<Character, Integer> count(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        List<Character>list = str.chars().mapToObj(n -> (char)n).toList();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            count = Collections.frequency(list, str.charAt(i));
            map.put(str.charAt(i), count);
        }
        return map;
    }
    public static void main(String[] args) {
        System.out.println(count("aba"));
    }
}
