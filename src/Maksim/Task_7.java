package Maksim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_7 {
    /*

    String h="AAABBBCCCDEF";
    String result = "";

    output
    DEF
     */
    public static String removeDuplicates(String str) {

     String result = "";
     List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
     for (String s : list) {
         int count = Collections.frequency(list,s);
         result += (count == 1) ? s : "";
     }
     return  result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCCDEF"));
    }
}
