package Dmitrii.InterviewTasks;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args){
        String palindromeStr = "Civic".toLowerCase();
        System.out.println("Entered my palindrome word is: " + isPalindrome(palindromeStr));
        System.out.println("Entered interview palindrome word is: " + isPalindromeIQFirst(palindromeStr));
        System.out.println("Entered interview StringBuilder palindrome word is: " + isPalindromeIQSecond(palindromeStr));
    }

    //My solution
    public static boolean isPalindrome(String str){
        boolean palindrome = false;
        int countFromHead = 0;
        int countFromTail = str.length()-1;
            if (str.length()>2){
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(countFromHead)==str.charAt(countFromTail)){
                        palindrome = true;
                        countFromHead++;
                        countFromTail--;
                    } else {
                        palindrome = false;
                    }
                }
            }
        return palindrome;
    }

// Solution from Interview Questions uses charAt()
    public static boolean isPalindromeIQFirst(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true; }

    // Solution from Interview Questions uses StringBuilder
    public static boolean isPalindromeIQSecond(String str) {
        if(str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str); }
}
