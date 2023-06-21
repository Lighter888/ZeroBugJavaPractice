package Dmitrii.InterviewTasks;

public class SumOfDigits {
    public static void main (String[] args){
        int num = 1346;
        int sum = 0;
        while(num>0){
         sum = sum + num%10;
         num = num/10;
        }
        System.out.println(sum);
    }
}
