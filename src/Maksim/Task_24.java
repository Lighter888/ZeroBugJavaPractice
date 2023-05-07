package Maksim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task_24 {

//    USE ITERATOR
//    ArrayList -- Remove "Ahmed"
//    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));


    public static List<String> sortList (List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed")) {
                it.remove();
            }
        }
     return list;
    }

    public static List<String> sortListLambda (List<String> list) {
        list.removeIf(s -> s.equals("Ahmed"));
        return list;
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println(sortList(names));
        System.out.println(sortListLambda(names));

    }
}
