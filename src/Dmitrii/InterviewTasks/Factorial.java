package Dmitrii.InterviewTasks;

public class Factorial {

    public static void main (String[] args){
        System.out.println(factorialNum(8));
    }

    public static int factorialNum (int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
