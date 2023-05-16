package Maksim.Tasks_0_20;

public class Task_10 {

    //Check if ascend true

    public static boolean verifyAscendNum(int[] numbers) {
        boolean ascend = false;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] < numbers[i+1]) {
                ascend = true;
            }else {
                ascend = false;
                break;
            }
        }
        return ascend;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(verifyAscendNum(numbers));
    }
}
