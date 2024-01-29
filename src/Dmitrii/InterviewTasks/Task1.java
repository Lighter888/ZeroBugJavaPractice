package Dmitrii.InterviewTasks;

import java.util.*;

public class Task1 {
    public static String unique (String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++)  {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if(newStr.contains(str.charAt(j) + "")) break;
                    newStr += str.charAt(j) + "";
                }
            }
        }
        return newStr;
    }
                                      //12321
    public static boolean isPalindrome(int num){
        int revNum = 0;
        int digit ;
        int temp = num;

        while(temp != 0){
            digit = temp % 10;
            revNum = revNum *10 + digit;
            temp = temp / 10;
        }
        System.out.println(revNum);
        return num == revNum;
    }

    public static void main (String[] args) {
//      String str = "aaabcdefabcc";
//        System.out.println("Unique values is: " + unique(str));
        System.out.println(isPalindrome(12321));
    }
}


