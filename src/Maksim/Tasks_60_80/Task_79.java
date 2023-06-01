package Maksim.Tasks_60_80;

public class Task_79 {

    /*
    Write an efficient program to find the sum of contiguous sub array within a
    one-dimensional array of numbers which has the largest sum.

    int a[]={ -2, -3, 4, -1, -2, 1, 5, -3};
    output: 7
     */

    public static void main(String[] args) {

        int[] a={ -2, -3, 4, -1, -2, 1, 5, -3};

        int maxFinal = Integer.MIN_VALUE;
        int maxTemp = 0;
        for (int i = 0; i <a.length; i++) {
            maxTemp= maxTemp + a[i];
            if (maxFinal < maxTemp) {
                maxFinal = maxTemp;
            }
            if (maxTemp < 0) {
                maxTemp = 0;
            }
        }

        System.out.println("Maximum contiguous sum is " + maxFinal);
    }
}
