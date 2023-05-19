package Maksim.Tasks_40_60;

public class Task_41 {
    /*
    Calculate the power of a number using a while loop

    The power (or exponent) of a number that says how many times to use the number in a multiplication.
    It is written as a small number to the right and above the base number.
     */

    public  static void power(int power, int baseNum) {

        int result = 1;
        while( power > 0) {
            result *= baseNum;
            power --;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {

        power(4,5);

    }
}
