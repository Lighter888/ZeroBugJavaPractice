package Maksim.Tasks_20_40;

import java.util.HashMap;
import java.util.Map;

public class Task_28 {

/*
    Find unique.
    String str = "accabbcd";
    Map<Character, Integer> unique = new HashMap<>();

    output
    {d=1}

 */

    public static void main(String[] args) {

        String str = "oaccabbcdf";
        Map<Character, Integer> unique = new HashMap<>();
        for (char c: str.toCharArray()) {
            int count = unique.getOrDefault(c, 0);
            unique.put(c, count + 1);
        }
        Map<Character, Integer> unique1 = new HashMap<>();

        for (Character key : unique.keySet()) {
            if (unique.get(key) == 1) {
                unique1.put(key,1);
            }
        }
        System.out.println(unique1);
    }
}
