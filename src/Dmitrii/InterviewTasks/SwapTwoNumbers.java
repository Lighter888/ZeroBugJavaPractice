package Dmitrii.InterviewTasks;

public class SwapTwoNumbers {
    public static void main (String[] args){
        int a = 7;
        int b = 3;
        //Swap numbers without using temp variable
        //Solution 1
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a + "\nb = " + b);
//        // Solution 2
//        a = a + b - (b = a);
//        System.out.println("a = " + a + "\nb = " + b);

//        // Swap numbers with temp variable
//        int temp = 0;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a = " + a + "\nb = " + b);

    }
}
