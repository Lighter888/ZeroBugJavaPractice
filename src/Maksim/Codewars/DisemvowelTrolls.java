package Maksim.Codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DisemvowelTrolls {

    // https://www.codewars.com/kata/52fba66badcd10859f00097e

    public static String disemVowel(String str) {

        String vowels = "aeiouAEIOU";
        StringBuilder trollStr = new StringBuilder();

        char[] strChar = str.toCharArray();
        for (char c : strChar) {
            if (!vowels.contains(c + "")) {
                trollStr.append(c);
            }
        }
        return trollStr.toString();
    }

    public static String disemVowel2(String str) {

        str = str.replaceAll("[AaEeIiOoUu]", "");

        return str;
    }

    public static void main(String[] args) {

        System.out.println(disemVowel("This website is for losers LOL"));

        System.out.println(disemVowel2("This website is for losers LOL"));
    }
}
