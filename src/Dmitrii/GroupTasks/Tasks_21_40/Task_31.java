package Dmitrii.GroupTasks.Tasks_21_40;

import java.util.Arrays;

public class Task_31 {
    public static void main (String[] args){
        //Given 2 arrays of ints, a and b, return true if
        //they have the same first element or they have the same last element.
        //Both arrays will be length 1 or more.

//        int [] a = {1,2,3,4};
//        int [] b = {1,2,3};

        int [] a = new int[4];
        int [] b = new int[3];

        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;

        b[0]=1;
        b[1]=2;
        b[2]=3;

        if(a[0]==b[0]){
            System.out.println("First element of an arrays are equals");
        } else if (a.length-1==b.length-1){
            System.out.println("Last element of an arrays are equals");
        } else {
            System.out.println("First or last element of an arrays is not equals!");
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
