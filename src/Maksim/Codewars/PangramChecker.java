package Maksim.Codewars;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


public class PangramChecker {

//    https://www.codewars.com/kata/545cedaa9943f7fe7b000048

    public static boolean check(String sentence){

        sentence = sentence.toLowerCase().replaceAll("[^a-zA-Z]", "");
        Set<String> set = Arrays.stream(sentence.split("")).collect(Collectors.toSet());
        System.out.println(set);

        return set.size() == 26;
    }

    public static void main(String[] args) {

        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
        System.out.println(check("A pangram is a sentence that contains every single letter of the alphabet at least once."));
    }
}
