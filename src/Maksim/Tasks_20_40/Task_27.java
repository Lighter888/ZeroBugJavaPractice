package Maksim.Tasks_20_40;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task_27 {

    /*
    Frequency
    String str="AABBDDDC";
    Map<Character, Integer> map = new LinkedHashMap<>();
    output
    {A=2, B=2, D=3, C=1}
     */
    public static void main(String[] args) {

        String str="AABBDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c: str.toCharArray()) {
            int count = map.getOrDefault(c,0);
            map.put(c, count + 1);
        }
        System.out.println(map);
    }
}
