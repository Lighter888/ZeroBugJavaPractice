package Dmitrii.InterviewTasks;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {
    public static void main(String[] args){
        String str = "abcdeabcdacbaca";
        System.out.println("Set of the characters that contains string: " + str);
        countCharsOnlyLoops(str);
        countCharsMaps(str);
    }
    public static void countCharsOnlyLoops(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = i; j < str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if ((!result.contains(str.charAt(i) + ""))) {
                result += ", " + str.charAt(i) + "=" + count ;
            }
        }
        System.out.println(result.replaceFirst(", ", ""));
    }
    public static void countCharsMaps(String str){
        Map<Character, Integer> countChar = new HashMap<>();
        Map<Character, Integer> ifMoreThan3 = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            if(countChar.containsKey(str.charAt(i))){
                countChar.put(str.charAt(i),countChar.get(str.charAt(i))+1);
            } else{
                countChar.put(str.charAt(i), 1);
            }
              }
        for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
             if(entry.getValue() > 3){
                 ifMoreThan3.put(entry.getKey(), entry.getValue());
             }
        }
        System.out.println(countChar);
        System.out.println("Return characters that are repeated more than 3 times: \n" + ifMoreThan3);
    }
}
