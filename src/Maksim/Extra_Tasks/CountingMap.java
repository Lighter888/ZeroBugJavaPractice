package Maksim.Extra_Tasks;

import java.util.HashMap;
import java.util.Map;

public class CountingMap {

    static String[] words = {"Hello", "Everyone", "One", "Hello", "One"};

    public static Map<String, Integer> countFrequency(String[] words) {

        Map<String , Integer> frequencies = new HashMap<>();

        for (String word : words) {
            int count = frequencies.getOrDefault(word,0);
            frequencies.put(word, count + 1);
        }
        return frequencies;
    }

    public static void main(String[] args) {
        System.out.println(countFrequency(words));
    }
}
