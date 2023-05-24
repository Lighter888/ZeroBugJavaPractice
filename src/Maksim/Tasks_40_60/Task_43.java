package Maksim.Tasks_40_60;

public class Task_43 {
    /*
    Perfect number is the sum of numbers that perfectNum divided by sum
    int perfectNum = 28; 6; 496;
     */
    public static void main(String[] args) {

        int perfectNum = 495;
        int sum = 0;

        for (int i = 1; i < perfectNum; i++) {
            if (perfectNum % i == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(perfectNum == sum);
    }
}
