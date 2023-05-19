package Maksim.Tasks_20_40;

import java.util.Arrays;

public class Task_36 {
    /*
     int a[]={1,3,5};
     int b[]={2,4,6};

     output Array
     [1, 2, 3, 4, 5, 6]
     */

    public static void main(String[] args) {

        int[] a ={1,3,5};
        int[] b ={2,4,6};

        int[] c = new int[a.length + b.length];
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            c[temp] = a[i];
            c[temp += 1] = b[i];
            temp++;
        }
//        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
