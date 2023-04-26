package Maksim;

public class Task_3 {

    //        int a=5;
    //        int b=6;
    //        change and print
    //        a==6;
    //        b==5;

    public static String changePrintNum(int a, int b) {
        String result = "a=="+ b + "\nb==" + a;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(changePrintNum(5,6));
    }
}
