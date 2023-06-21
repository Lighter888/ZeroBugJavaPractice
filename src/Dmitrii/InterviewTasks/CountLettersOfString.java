package Dmitrii.InterviewTasks;

import java.util.HashMap;
import java.util.Map;

public class CountLettersOfString {
    public static Map <Character, Integer> countLetters (String str){
        Map<Character,Integer> countMap = new HashMap<>();
        Map<Character,Integer> newMap = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if(countMap.containsKey(ch)){
                countMap.put(ch,countMap.get(ch)+1);
            } else{
                countMap.put(ch,1);
            }
        }
        for (Character each : countMap.keySet()) {
            if(countMap.get(each) >= 3){
                newMap.put(each,countMap.get(each));
            }
        }
        return newMap;
    }

    public static void main (String[] args){
        String str = "aaaabbddddftttttt";
        System.out.println("Count of letters witch repeated more than three times in the is: "+countLetters(str));
    }
}
