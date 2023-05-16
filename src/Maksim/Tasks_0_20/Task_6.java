package Maksim.Tasks_0_20;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
String h="AAABBBCCC";
        String result = "";

        output
        ABC

 */
public class Task_6 {

    public static String removeDuplicates_1(String string) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (!result.toString().contains("" + string.charAt(i))) {
                result.append(string.charAt(i));
            }
        }
        return String.valueOf(result);
    }

    public static String removeDuplicates_2(String string) {

        String result = "";
        Set<String> newString = new LinkedHashSet<>(Arrays.asList(string.split("")));
        for (String str: newString) {
            result += str;
        }

        return result;
    }


    public static void main(String[] args) {

        String h = "AAAAFBBBCCC";

        System.out.println(removeDuplicates_1(h));
        System.out.println(removeDuplicates_2(h));

    }
}
