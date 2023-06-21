package Dmitrii.InterviewTasks;

public class DivisionWithoutDivide {
    public static void main (String[] args){
        System.out.println(division(200,50));
    }
    public static String division(int dividend, int divisor){
        int reminder = dividend;
        int quotient = 0;
        while(dividend>0){
            dividend = dividend - divisor;
            quotient++;
        }
        return reminder +" / "+ divisor +" = "+ quotient;
    }
}
