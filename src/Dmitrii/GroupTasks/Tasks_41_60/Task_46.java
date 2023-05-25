package Dmitrii.GroupTasks.Tasks_41_60;

import java.util.Arrays;

public class Task_46 {
//    //46
//      String a="aaa10ss20bb30";
//    output = 60
//      String str1 ="";

    public static void main(String[] args) {

        //  Main group solution
        String str = "aa10aa%^^$#%^$a10ss20bb30aww1tt1";
        int sum = 0;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                newStr += str.charAt(i);
            } else {
                newStr += " ";
            }
        }
        System.out.println(newStr);
        newStr = newStr.trim();
        String[] arrStr = newStr.split(" ");
        System.out.println(Arrays.toString(arrStr));
        for (String s : arrStr) {
            if (!s.equals("")) {
                sum += Integer.parseInt(s);
            }
        }
        System.out.println(sum);

//****************************************************************

//        // Tatsiana solution
//        String s = "aa10aa%^^$#%^$a10ss20bb30aww1tt1";
//        int sum = 0;
//        String[] numbers = s.split("[^0-9]+");
//        for (String number : numbers) {
//            sum += Integer.parseInt(number);
//        }
//        System.out.println("Sum of numbers: " + sum);

//****************************************************************

//        // MaxMish solution
//        String str = "aa10aa%^^$#%^$a10ss20bb30aww1tt1";
//        String digits;
//
//        digits = str.replaceAll("[^0-9]+"," ");
//
//        int sum = 0;
//        String[] nums = digits.trim().split(" ");
////        System.out.println(Arrays.toString(nums));
//        for (String num : nums) {
//            if (!num.equals("")) {
//            sum += Integer.parseInt(num);
//            }
//        }
//        System.out.println(sum);


    }//Main
}//Class
