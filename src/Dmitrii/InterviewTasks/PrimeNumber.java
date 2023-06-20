package Dmitrii.InterviewTasks;

public class PrimeNumber {

    public static void main (String[] args){
        System.out.println("The Prime number is: " + primeNum(17));
    }
    public static boolean primeNum(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
