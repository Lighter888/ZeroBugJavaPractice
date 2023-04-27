package Dmitrii.GroupTasks;

public class Task_22 {

    public static void main(String[] args){
//        Numbers -- Prime Number. Prime num is a number that divided by itself and 1
//        Write a method that can check if a number is prime or not

        System.out.println(solutionTask_22(17));
    }
    public static boolean solutionTask_22 (int num){
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
            }
        for(int i = 2; i<num; i++){
            if(num%i==0){
                isPrime = false;
            }
        }
        return  isPrime;
    }
}
