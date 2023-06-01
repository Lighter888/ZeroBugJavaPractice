package Maksim.Tasks_60_80;

public class Task_72 {

//    don't use divide operator
//    int a = 11;
//    int b = 2;
//    divide a
//    by b
//    and result
//    is = 5
//    reminder = 1

    public static void main(String[] args) {

        int a = 11;
        int b = 2;

        int result = 0;
        int remainder = 0;

        while ( a > b) {
            a = a - b;
            remainder = a;
            result++;
        }
        System.out.println(result);
        System.out.println(remainder);
    }
}
