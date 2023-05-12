package Maksim.Extra_Tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStr {

    public static String removeDup(String str) {

        String strWithNoDuplicate = "";
        char[] letter = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : letter) {
            set.add(ch);
            }
        for (Character character : set) {
            strWithNoDuplicate += character;
        }
        return strWithNoDuplicate;
    }
    public static void main(String[] args) {

        System.out.println(removeDup("helloooolllh"));

    }
}
