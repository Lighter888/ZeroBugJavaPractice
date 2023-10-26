package Dmitrii.FromRealInterview;

import java.util.Arrays;

public class Test09_07_23 {
    // Max's solution
//    public static void main (String[] args){
//        String text = "a100bb10de11";
//        String digitsStr = "0";
//        text = text + " ";
//        int result = 0;
//        for (int i = 0; i<text.length(); i++){
//            if(Character.isDigit(text.charAt(i))){
//                digitsStr += text.charAt(i);
//            } else {
//                result += Integer.parseInt(digitsStr);
//                digitsStr = "0";
//            }
//        }
//        System.out.println(result);
//    }


      //Tofig's solution
//    public static void main(String[] args) {
//        String input = "adsd100dfdf20fdfd2";
//
//        int sum = 0;
//        String currentNumber = "";
//
//        for (char c : input.toCharArray()) {
//            if (Character.isDigit(c)) {
//                currentNumber += c;
//            } else if (!currentNumber.isEmpty()) {
//                sum += Integer.parseInt(currentNumber);
//                currentNumber = "";
//            }
//        }
//
//        // Check if there's a number at the end of the string
//        if (!currentNumber.isEmpty()) {
//            sum += Integer.parseInt(currentNumber);
//        }
//
//        System.out.println("Sum of numbers inside the string: " + sum);
//      }

    //My solution
    public static void main (String[] args){
        String text = "a100bb10de11";
        String newStr = "";
        int result = 0;
        newStr = text.replaceAll("[a-zA-Z]", " ");
        while (newStr.contains("  ")){
            newStr = newStr.replace("  ", " ");
        }
        String [] nums = newStr.trim().split(" ");
        System.out.println(Arrays.toString(nums));
        for (String num : nums) {
            result += Integer.parseInt(num);
        }
        System.out.println(result);
    }



   }
