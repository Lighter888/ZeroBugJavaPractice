package Maksim.Tasks_40_60;

import java.util.Arrays;

public class Task_46 {
    /*
        String a="aaa10ss20bb30";
        output 60

     */

    public static void main(String[] args) {

        String str = "aa10aa%^^$#%^$a10ss20bb30aww1tt1";
        String digits;

        digits = str.replaceAll("[^0-9]+"," ");
        System.out.println(digits);


//        String digits = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                digits += str.charAt(i);
//            } else {
//                digits += " ";
//            }
//        }
        int sum = 0;

        String[] nums = digits.trim().split(" ");
        System.out.println(Arrays.toString(nums));
        for (String num : nums) {
//            if (!num.equals("")) {
                sum += Integer.parseInt(num);
//            }
        }
        System.out.println(sum);




    }
}
