package Maksim.Tasks_20_40;

public class Task_26 {

    /*
    Write a method that can check if a number is Armstrong  number

    Armstrong number is a number that is equal to the sum of cubes of its digits.
    For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. Let's try to
    understand why 153 is an Armstrong number. Let's try to understand why 371 is an
    Armstrong number.
     */

    public static boolean isArmstrongNum(int num) {

        int numResult = 0;
        String[] numbers = Integer.toString(num).split("");
        for (String number : numbers) {
            numResult += Integer.parseInt(number) * Integer.parseInt(number) * Integer.parseInt(number);
        }
        return numResult == num;
    }
    public static void main(String[] args) {

        System.out.println(isArmstrongNum(153));
    }
}
