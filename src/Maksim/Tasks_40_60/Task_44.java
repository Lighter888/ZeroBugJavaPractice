package Maksim.Tasks_40_60;

import java.util.Arrays;

public class Task_44 {

    /*
    COMBINE
    int[] a = {1,2};
    int[] b ={3,4};

    output
    [1, 2, 3, 4]
     */

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b ={4,5,6,7};
        int[] c = new int[a.length + b.length];

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,c.length - b.length, b.length);
        System.out.println(Arrays.toString(c));

        String S1 = "Nisum";
        String S2 = new String(S1);
        String S3 ="Nisum";
        System.out.println((S1.equals(S2))); //true
        System.out.println(S1==S2); // false
        System.out.println((S3==S1)); // true

    }
}
