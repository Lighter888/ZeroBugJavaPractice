package Maksim;

public class Task_11 {

    //  if disc  true

    public static boolean verifyDiscNum(int[] numbers) {
        boolean ascend = false;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]) {
                ascend = true;
            }else {
                ascend = false;
                break;
            }
        }
        return ascend;
    }

    public static void main(String[] args) {

        int[] numbers = {7,6,5,4,8};;
        System.out.println(verifyDiscNum(numbers));
    }
}
