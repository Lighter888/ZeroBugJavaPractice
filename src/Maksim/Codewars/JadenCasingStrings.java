package Maksim.Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {
    //https://www.codewars.com/kata/5390bac347d09b7da40006f6
    public static String toJadenCase(Object phrase) {
        String pr = (String) phrase;
        if (phrase == null || pr.equals("")) {
            return null;
        }
        String newPhrase = "";
        newPhrase += Character.toUpperCase(pr.charAt(0));
        for (int i = 1; i < pr.length(); i++) {
            if ((pr.charAt(i - 1) + "").equals(" ")) {
                newPhrase += Character.toUpperCase(pr.charAt(i));
            } else {
                newPhrase += pr.charAt(i);
            }
        }
        return newPhrase;
    }

    public static String alternativeToJadenCase(String phrase) {
        if (null == phrase || phrase.length() == 0) {
            return null;
        }
        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(alternativeToJadenCase("most trees are blue"));
    }
}
