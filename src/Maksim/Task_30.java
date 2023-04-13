package Maksim;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
//30
Array -- N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that
 sum up to 0. The function can return any such array. For example, given N = 4, the function
 could return [0,1,2,-3] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect
  (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
   (but there are many more correct answers).

      int n=6;
        int []a=new int[n];
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (i+1==a.length){
                a[i]=sum-(2*sum);
                break;
            }
            a[i]=i;
            sum+=i;
        }
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
 */
public class Task_30 {

    public static int[] unique(int num) {
        if (num > 1 && num < 100) {
            int[] arr = new int[num];
            int sum = 0;
            Random random = new Random();
            int i = 0;
            while (i < num - 1) {
                int temp = random.nextInt(-num, num);
                boolean contains = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == temp) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    arr[i] = temp;
                    sum += temp;
                    i++;
                }
            }
            arr[num - 1] = -sum;
            return arr;
        }
        return null;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(unique(10)));

     }
}