package Maksim.Tasks_20_40;

public class Task_21 {
    /*
    Factorial Number

    4! = 4 × 3 × 2 × 1 = 24
    7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
    1! = 1

     */

    public static void main(String[] args) {
        int factorialNum = 7;
        int result = 1;

        for (int i = factorialNum; i > 0 ; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
