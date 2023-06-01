package Maksim.Tasks_60_80;

import java.util.*;

public class Task_75 {

//    ArrayList<String> gg = new ArrayList<>(Arrays.asList("three, four", "five", "seven"));
//    print out
//    four five seven

    public static void main(String[] args) {

        ArrayList<String> gg = new ArrayList<>(Arrays.asList("three", "four", "five", "seven"));
        gg.set(0,"four");
        Set<String> set = new LinkedHashSet<>(gg);
        System.out.println(set);
    }
}
