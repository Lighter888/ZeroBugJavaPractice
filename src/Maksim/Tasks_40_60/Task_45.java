package Maksim.Tasks_40_60;

import java.util.*;

public class Task_45 {

    /*
    Find out most repetitive word
    ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma","armud","armud","armud","armud","pear","apple","pear","pear"));
     */

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("alma", "alma", "alma", "alma", "armud", "armud", "armud", "armud", "armud", "pear", "apple", "pear", "pear"));


        // my solution
        Set<String> set = new LinkedHashSet<>(Set.copyOf(fruits));
        int max = 1;
        String result = "";

        for (String s : set) {
            int count = (Collections.frequency(fruits, s));
            if (count > max) {
                max = count;
                result = s;
            }
        }
        System.out.println(result);

        //correct solution using map

        Map<String,Integer> map =new LinkedHashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            int count = Collections.frequency(fruits, fruits.get(i));
            map.put(fruits.get(i), count);
        }
        System.out.println(map);

        // the best solution using map

        Map<String , Integer> mapFruits = new HashMap<>();
        for (String fruit : fruits) {
            int count = mapFruits.getOrDefault(fruit, 0);
            mapFruits.put(fruit, count + 1);
        }
        System.out.println(mapFruits);
    }
}
