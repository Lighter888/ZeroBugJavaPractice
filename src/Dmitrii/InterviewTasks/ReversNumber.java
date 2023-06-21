package Dmitrii.InterviewTasks;

public class ReversNumber {
    public static void main(String[] args){
        int num = 1348;
        int digit = 0;
        int reverseNum = 0;
        while (num>0){
            digit = num%10;
            reverseNum = reverseNum * 10 + digit;
            num = num/10;
        }
        System.out.println(reverseNum);
    }
}
