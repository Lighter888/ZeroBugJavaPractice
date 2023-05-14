package Tatsianna;

public class Task_26 {

    public static boolean isArmstrong(int num) {
        String numStr = Integer.toString(num);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, 3);
        }
        return sum == num;
    }
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
    }
}
