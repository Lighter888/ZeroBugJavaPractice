package Tatsianna;

import java.util.Arrays;

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

    public static int[] sumZero(int n) {
    int[] answer = new int[n];

    if (n % 2 != 0) {
        answer[n / 2] = 0;
    }
    for (int i = 0; i < n / 2; i++) {
        answer[i] =  - (i + 1) * 2;
        answer[n - i - 1] = (1 + i) * 2;
        }
    return answer;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumZero(10)));
    }
}







