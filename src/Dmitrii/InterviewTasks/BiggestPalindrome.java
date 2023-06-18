package Dmitrii.InterviewTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiggestPalindrome {
    public static void main (String[] args){
        String sentence = "Civic alla deified bla";
        System.out.println(bigPalindrome(sentence));
    }
    public static String bigPalindrome(String sentence){
        String biggestPal = "";
        List<String> arrList = Arrays.asList(sentence.split(" "));
        for (String each:arrList) {
            String revStr = new StringBuilder(each).reverse().toString();
            if(each.equalsIgnoreCase(revStr)&& each.length() > biggestPal.length()){
                biggestPal = each;
            }
        }
        return biggestPal;
    }
}
