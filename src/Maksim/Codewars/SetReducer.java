package Maksim.Codewars;

import java.util.ArrayList;
import java.util.List;

public class SetReducer {

    // https://www.codewars.com/kata/63cbe409959401003e09978b

    public static int setReducer(int[] arr) {

        int[] reducedArr = new int[arr.length];
        int count = 1;
        int reducedCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                reducedArr[reducedCount] = count;
                count = 1;
                reducedCount++;
            } else {
                count++;
            }
        }
        reducedArr[reducedCount] = count; //запись последнего элемента в массив
        reducedCount++; // создаем длину нового массива

        if (reducedCount == 1) {
            return reducedArr[0];
        } else {
            int[] nextArr = new int[reducedCount];
            System.arraycopy(reducedArr, 0, nextArr, 0, reducedCount);
            return setReducer(nextArr);
        }
    }
    public static void main(String[] args) {

        int[] sequence = {2, 4, 4, 6, 2, 1, 1, 5, 6, 7, 8, 8, 8, 8, 9, 0, 1, 1, 5, 4, 4};
        int result = setReducer(sequence);
        System.out.println(result);
    }
}




