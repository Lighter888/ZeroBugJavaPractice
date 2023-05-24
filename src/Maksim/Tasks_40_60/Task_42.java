package Maksim.Tasks_40_60;

public class Task_42 {
    /*
        reverse   USE STRINGBUFFER
        int num = -123;
        -321
     */

    public static void main(String[] args) {

        int num = 123;
        StringBuffer stringBuffer = new StringBuffer();
        int newNum;

        if (num < 0) {
            num = num * (-1);
            stringBuffer.append(num);
            newNum = (-1) * Integer.parseInt(stringBuffer.reverse().toString());
        } else {
            stringBuffer.append(num);
            newNum = Integer.parseInt(stringBuffer.reverse().toString());
        }

        System.out.println(newNum);
    }
}
