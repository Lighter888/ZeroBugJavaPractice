package Dmitrii.GroupTasks.CodeWars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HighestScoreOfString {
//    Given a string of words, you need to find the highest scoring word.
//
//    Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//    For example, the score of abad is 8 (1 + 2 + 1 + 4).
//
//    You need to return the highest scoring word as a string.
//
//    If two words score the same, return the word that appears earliest in the original string.
//
//    All letters will be lowercase and all inputs will be valid.


    public static void main(String[] args) {
        String sentence = "Today is good day";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Integer> points = new HashMap<>();
        Map<Integer, String> wordsPoint = new HashMap<>();
        int count = 1;
        for (char each : alphabet) {
            points.put(each, count);
            count++;
        }
        String [] words = sentence.split(" ");
        int sum = 0;
        for (String word : words) {
            for (char letter: word.toLowerCase().toCharArray()) {
                sum += points.get(letter);
            }
            wordsPoint.put(sum, word);
            sum = 0;
        }
        Object []arr = wordsPoint.keySet().toArray();
        Arrays.sort(arr);

        System.out.println("My solution is: " + wordsPoint.get(arr[arr.length-1]));
        System.out.println("Max's solution is: " + high(sentence));
    }

    //Max solution
    public static String high(String s) {
        int score = 0;
        int maxScore = Integer.MIN_VALUE;
        String result = "";
        for (String string : s.split(" ")) {
            for (int i = 0; i < string.length(); i++) {
                score += (string.charAt(i) - 96);
                if (score > maxScore) {
                    maxScore = score;
                    result = string;
                }
            }
            score = 0;
        }
        return result;
    }
}
