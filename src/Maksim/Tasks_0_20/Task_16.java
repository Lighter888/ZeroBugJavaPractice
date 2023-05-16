package Maksim.Tasks_0_20;

public class Task_16 {
    /*
    USE WHILE LOOP
    int num1=5;
    int num2=2;

    output
    5 devided by 2 is: 2 and remainder is 1
     */

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;
//        String result = num1 + " devided by " + num2 + " is: " + num1/num2 + " and reminder is " + num1%num2;
//        System.out.println(result);
        if(num2 == 0) {
            System.out.println("Invalid Number");
        }
        System.out.print(num1 +" devided by " + num2 +" is: ");

        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }
}
