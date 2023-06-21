package Dmitrii.InterviewTasks;

import java.awt.desktop.PreferencesEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseOnlyLettersInWords {
     public static void main(String[] args){
         String inputStr = "Hello students school";
         System.out.println(reversedWordsOfStr(inputStr));
     }
     public static String reversedWordsOfStr(String str){
         String reversedWordsStr = "";
         String [] arrStr = str.split(" ");
         for (int i = 0; i < arrStr.length; i++) {
             reversedWordsStr += new StringBuilder(arrStr[i]).reverse().toString() + " ";
         }
         return reversedWordsStr.strip();
     }
}
