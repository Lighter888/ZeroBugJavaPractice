package Maksim.Tasks_40_60;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task_49 {

    /*
    Write a program which prints out the numbers from 1 to 30:
    for numbers which are divisible by 3, print "FIN" instead of the number.
    for numbers which are divisible by 5, print "RA" instead of the number
    for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
     */

    public static List<String> replaceNumbers(int n) {

        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        List<String> list = new ArrayList<>();

        for (Integer number : numbers) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                list.add("FINRA");
            } else if (number % 3 == 0) {
                list.add("FIN");
            } else if (number % 5 == 0) {
                list.add("RA");
            } else {
               list.add(String.valueOf(number));
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        a = a^b^(b = a);
        System.out.println("a = " + a + " b = " + b);

        System.out.println(replaceNumbers(100));
    }
}
