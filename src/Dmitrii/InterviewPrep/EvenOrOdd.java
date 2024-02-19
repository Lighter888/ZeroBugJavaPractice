package Dmitrii.InterviewPrep;

public class EvenOrOdd {
    public static void main (String[]args){
        int num1 = 12;
        int num2 = 11;
        System.out.println( num1 + " is: " + evenOrOddNum(num1) + " number");
        System.out.println(num2 + " is: " + evenOrOddNum(num2) + " number");
    }
    public static String evenOrOddNum(int num){
        if(num%2 == 0){
            return "Even";
        }
        return "Odd";
    }
}
