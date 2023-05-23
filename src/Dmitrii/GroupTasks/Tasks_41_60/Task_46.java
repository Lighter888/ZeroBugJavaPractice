package Dmitrii.GroupTasks.Tasks_41_60;

import java.util.Arrays;

public class Task_46 {
//    //46
//      String a="aaa10ss20bb30";
//    output = 60
//      String str1 ="";

    public static void main(String[] args) {

        // Solution 1
        String str = "aaa10ss20bb30";
  //    output = 60
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

//        // Solution 2
//        String s = "aaa10ss20bb30";
//        int sum = 0;
//        String[] numbers = s.split("[^0-9]+");
//        for (String number : numbers) {
//            sum += Integer.parseInt(number);
//        }
//        System.out.println("Sum of numbers: " + sum);

    }//Main
}//Class
