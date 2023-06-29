package Maksim.Codewars;

public class EqualSidesOfAnArray {
    //https://www.codewars.com/kata/5679aa472b8f57fb8c000047

    public static int findEvenIndex(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }
            if (sumLeft == sumRight) {
                return i;
            }
            sumRight = 0;
            sumLeft = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));

    }
}
