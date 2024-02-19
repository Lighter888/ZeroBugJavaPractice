package Dmitrii.InterviewPrep;

public class SumOfDigits {
    public static void main (String[]args){
        int number = 12345;
        System.out.println(sumOfDigits(number));
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        int digit = 0;
        while (num > 0){
            digit = num%10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }
}
