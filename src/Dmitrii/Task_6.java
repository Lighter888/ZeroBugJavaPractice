package Dmitrii;

/*
String h="AAABBBCCC";
        String result = "";

        output
        ABC

 */

public class Task_6 {

    public static void main(String[] args) {

        String h = "AAAAFBBBCCC";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < h.length(); i++) {
            if (!result.toString().contains("" + h.charAt(i))) {
                result.append(h.charAt(i));
            }
        }
        System.out.println(result);
        System.out.println("111111");
    }
}
