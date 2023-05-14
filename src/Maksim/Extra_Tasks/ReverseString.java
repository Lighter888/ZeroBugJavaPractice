package Maksim.Extra_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        String input = "Geeks for Geeks";
        List<Character> arrList = new ArrayList<>();
        StringBuilder reverse = new StringBuilder();

        for (char c : input.toCharArray()) {
            arrList.add(c);
        }
        Collections.reverse(arrList);

        for (Character character : arrList) {
            reverse.append(character);
        }
        System.out.println(reverse);


        // solution in one string using StringBuilder class
        String reverseNew = new StringBuilder(input).reverse().toString();
        System.out.println(reverseNew);
    }
}
