package Maksim.Tasks_0_20;

import java.util.Arrays;

public class Task_8 {
   /*

    String s="1a2b3c4f!@#";
    int sum=0;
    String letter="";
    String digit="";
    String sign="";

    output:
    10
    a b c f
    1 2 3 4
    !@#

    */

    public static void filterString(String str) {

        String s = "1a2b3c4f!@#";
        int sum = 0;
        String letter = "";
        String digit = "";
        String sign = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letter += c + " ";
            } else if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
                digit += c + " ";
            } else {
                sign += c;
            }
        }
        System.out.println(sum);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(sign);
    }

    public static void main(String[] args) {

        String s="1a2b3c4f!@#";
        filterString(s);
    }
}
