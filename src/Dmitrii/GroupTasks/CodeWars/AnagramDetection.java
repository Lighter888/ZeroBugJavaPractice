package Dmitrii.GroupTasks.CodeWars;

import java.util.Arrays;

public class AnagramDetection {
//    An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//    Note: anagrams are case insensitive
//
//    Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
//
//            Examples

//"foefet" is an anagram of "toffee"
//
//            "Buckethead" is an anagram of "DeathCubeK"
    public static boolean isAnagram(String a, String b){
        char [] sortStrA = a.toLowerCase().toCharArray();
        Arrays.sort(sortStrA);
        char [] sortStrB = b.toLowerCase().toCharArray();
        Arrays.sort(sortStrB);
        return Arrays.equals(sortStrA, sortStrB);
    }

    public static void main (String[] args){
        String a = "Buckethead";
        String b = "DeathCubeK";
        System.out.println(isAnagram(a,b));
    }
}
