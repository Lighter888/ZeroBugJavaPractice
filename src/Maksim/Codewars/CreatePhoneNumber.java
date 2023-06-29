package Maksim.Codewars;

public class CreatePhoneNumber {

    //https://www.codewars.com/kata/525f50e3b73515a6db000b83
    public static String myCreatePhoneNumber(int[] numbers) {
        StringBuilder builder = new StringBuilder("(");
        int i = 0;
        while (i < 3) {
            builder.append(numbers[i]);
            i++;
        }
        builder.append(") ");
        while (i < 6) {
            builder.append(numbers[i]);
            i++;
        }
        builder.append("-");
        while (i < 10) {
            builder.append(numbers[i]);
            i++;
        }
        return builder.toString();
    }

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(xxx) xxx-xxxx";

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        return phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println(myCreatePhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}