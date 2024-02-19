package Dmitrii.InterviewPrep;

public class SwapTwoNumbers {
    public static void main (String[]args){
        int a = 10;
        int b = 15;

//        //with temp variable
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

//        // without temp variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a);
//        System.out.println(b);

        // another solution
        a = (a + b - (b = a));
        System.out.println(a);
        System.out.println(b);
    }
}
