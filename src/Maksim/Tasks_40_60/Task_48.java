package Maksim.Tasks_40_60;

import java.util.*;
import java.util.stream.Collectors;

public class Task_48 {

//    ArrayList<String> d = new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
//    How do you find if ArrayList contains duplicates or not?
//            (ALSO REMOVE DUPLICATE AT SAME TIME)

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));

        Set<String> set = new LinkedHashSet<>(list);

        List<String> newList = list.stream()
                .distinct()
                .toList();

        System.out.println(newList);
        System.out.println(set);

        String result = (list.size() == set.size()) ? "No duplicates" : "Contains duplicates";

        System.out.println(result);

    }


}
