package Maksim;

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
 */
public class Task_30 {
    public static void main(String[] args) {

        int N = 8;
        int[] arr = new int[N];
        Random random = new Random();
        arr[0] = random.nextInt(-N, N);
        int sum = arr[0];
        int element = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = random.nextInt(-N, N);
            if (element == arr[i]){
                arr[i] = random.nextInt(-N, N);
            }
            element = arr[i];
            if (i + 1 == arr.length){
                arr[i] = - sum;
                break;
            }
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
