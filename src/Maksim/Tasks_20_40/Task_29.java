package Maksim.Tasks_20_40;

import java.util.*;

public class Task_29 {

    /*
    Map -- Min value  and Max value
    Map<String,Integer>t=new HashMap<>();
    t.put("a",2);
    t.put("q",5);
    t.put("w",1);

    output
    1
     */

    public static void main(String[] arg) {

        Map<String, Integer> tmap = new HashMap<>();

        tmap.put("a", 2);
        tmap.put("f", -1);
        tmap.put("q", 5);
        tmap.put("w", 1);
        // 1st solution using map
        int min = Integer.MAX_VALUE;
        for (String str : tmap.keySet()) {
            if (tmap.get(str) < min) {
                min = tmap.get(str);
            }
        }
        //2nd solution using list and method min in Collections
        List<Integer> list = new ArrayList<>(tmap.values());
        int minNew = Collections.min(list);

        System.out.println(min);
        System.out.println(minNew);
    }
}
