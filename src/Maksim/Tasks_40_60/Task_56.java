package Maksim.Tasks_40_60;

public class Task_56 {

    /*
    Given an array of ints, print true if the array contains a 5 next
    to a 5 anywhere in the array. If no consecutive 5s or no 5s are
    detected in your code then print false.
    nums → [1, 5, 5, 1, 1] → true
    nums → [1, 8, 5, 5, 0] → true
    nums → [1, 5, 4, 1, 5] → false
    nums → [1, 4, 4, 1, 99] → false
    */


    public static boolean is5goNext5(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] == 5) && (numbers[i+1] == 5)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(is5goNext5(new int[] {1, 5, 5, 6, 1, 1, 5, 4}));
    }
}
