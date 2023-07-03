package Dmitrii.InterviewTasks;

public class Armstrong {
    public static void main (String[] args){
        int num1 = 370;
        int num2 = 587;
        System.out.println("Number "+ num1 +" is Armstrong: " + isArmstrong(num1));
        System.out.println("Number "+ num2 +" is Armstrong: " + isArmstrong(num2));
    }
    public static boolean isArmstrong(int num){
        int temp = 0;
        int digit = 0;
        int sum = 0;

        temp = num;
        while(temp>0){
            digit = temp%10;
            sum = sum + (digit * digit * digit);
            temp = temp/10;
        }
        return num == sum;
    }


}
