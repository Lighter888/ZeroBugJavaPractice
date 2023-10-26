package Dmitrii.FromRealInterview;

public class IsPalindromeFromRealInterview {

    public static void main(String[] args) {
        String str = "civic";
        System.out.println("Is word Palindrome or not: " + isPalindrom(str));
    }

    public static boolean isPalindrom(String str) {
        StringBuilder sb = new StringBuilder(str);
        String newStr = sb.reverse().toString();
        return newStr.equals(str);

    }
}
