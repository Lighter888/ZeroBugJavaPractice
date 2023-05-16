package Maksim.Tasks_0_20;

public class Task_17 {

    /*
    int  a = 12;
    int  b  = 20;

    output
    a  20
    b  10
     */

    public static void main(String[] args) {
        int  a = 12;
        int  b  = 20;

        b = b - a;
        a = a + b;
        b = a - b;

        System.out.println(a);
        System.out.println(b);
    }


}
