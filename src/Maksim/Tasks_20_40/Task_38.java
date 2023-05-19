package Maksim.Tasks_20_40;

import java.util.*;
import java.util.stream.Collectors;

public class Task_38 {

//    SORT MAP

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);

        //sort by key use TreeMap
        Map<String, Integer> mapSorted = new TreeMap<>(map);
        System.out.println(mapSorted);

        //sort by value use Map.Entry.comparingByValue()
        LinkedHashMap<String, Integer> mapSortByValue = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue,newValue) -> oldValue, LinkedHashMap::new ));

        System.out.println(mapSortByValue);


        for (Map.Entry<String, Integer> entry : mapSorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}
