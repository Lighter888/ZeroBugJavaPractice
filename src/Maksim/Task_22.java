package Maksim;

import java.util.ArrayList;
import java.util.List;

public class Task_22 {

    //        Numbers -- Prime Number. Prime num is a number that divided by itself and 1
    //        Write a method that can check if a number is prime or not

    public static boolean verifyNumberIsPrime(int number){
        boolean numberIsPrime = (number > 1);
        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                numberIsPrime = false;
                break;
            }
        }
        return numberIsPrime;
    }

    public static void main(String[] args) {

        List<Integer> primeList = new ArrayList<>();
        for (int number = -10; number < 100; number++) {
            if (verifyNumberIsPrime(number)) {
                primeList.add(number);
            }
        }
        System.out.println(primeList);
    }
}
