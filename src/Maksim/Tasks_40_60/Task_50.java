package Maksim.Tasks_40_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_50 {

    /*
    Remove from same string assign same string.
    String h="AABCC";
    Remove
    SECOND WAY --write a program that can return the unique characters from a string
    Ex:  "AABCC" ==> "B"
     */

    public static void main(String[] args) {

        String str ="AABCC";

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        for (Character character : list) {
            int count = Collections.frequency(list, character);
            if (count == 1) {
                str = "" + character;
            }
        }
        System.out.println(str);
    }
}
