package Dmitrii.InterviewPrep;

public class ReversNumber {
    public static void main(String[] args){
        int number = 1956;
        System.out.println("Original number is: " + number);

        System.out.println("Reversed number is: " + reversNum(number));
    }
    public static int reversNum (int num){
        int digit = 0;
        int revNum = 0;
        while(num > 0){
            digit = num%10;
            revNum = revNum * 10 + digit;
            num = num/10;
        }
        return revNum;
    }
}
