package Maksim.Tasks_20_40;

public class Task_23 {

//      int num=-1234556;
//      -6554321
    public static void main(String[] args) {

        int num = -1234556;
        if (num < 0) {
            System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(-num)).reverse().toString()) * (-1));
        } else {
            System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()));
        }
    }
}

