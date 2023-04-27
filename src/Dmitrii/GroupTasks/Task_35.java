package Dmitrii.GroupTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_35 {

//    //35
//    String s = "Seda, 20, Leyla, 30";
//
//    First output
//    {Seda= 20,  Leyla= 30}
//
//    Second
//    String str = "Seda, Nurik, Leyla, Seda";
//    {Seda=,  Nurik=,  Leyla=,  Seda=}

    public static void main(String[] args) {
        String str1 = "Seda, 20, Leyla, 30";
        String str2 = "Seda, Nurik, Leyla, Seda";
        System.out.println(mapStrInt1(str1));
        System.out.println(mapStrInt2(str2));
    }

    public static Map<String, Integer> mapStrInt1(String str) {
        String[] arrStr = str.split(", ");
        Map<String, Integer> arrToMap = new HashMap<>();
        for (int i = 0; i < arrStr.length; i = i + 2) {
            arrToMap.put(arrStr[i], Integer.valueOf(arrStr[i + 1]));
        }
        return arrToMap;
    }

    public static Map<String, String> mapStrInt2(String str) {
        String[] arrStr = str.split(",");
        Map<String, String> arrToMap = new LinkedHashMap<>();
        for (int i = 0; i < arrStr.length; i++) {
            arrToMap.put(arrStr[i], "");
        }
        return arrToMap;
    }
}
