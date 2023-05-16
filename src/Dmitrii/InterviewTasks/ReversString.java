package Dmitrii.InterviewTasks;

import java.util.Locale;

public class ReversString {

    public static void main(String[] args) {
        String string = "Hello World";
        char [] charStr = string.toCharArray();
        System.out.println("Trough For Loop: " + reverseStrForLoop(string));
        System.out.println("Trough String Builder: " + reverseStrBuilder(string));
        System.out.println("Uses char Array: "  + reversStrCharArr(charStr));

    }

    public static String reverseStrForLoop(String str){
        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public static String reverseStrBuilder (String str){
        String reversedStr = new StringBuilder(str).reverse().toString();
        return reversedStr;
    }

    public static String reversStrCharArr (char[] letters){
        StringBuilder reverseStr = new StringBuilder();
        for(int i = letters.length-1; i >= 0; i--){
            reverseStr.append(letters[i]);
        }
        return reverseStr.toString();
    }



}
