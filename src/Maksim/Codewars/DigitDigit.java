package Maksim.Codewars;

import java.util.stream.Collectors;

public class DigitDigit {

    //https://www.codewars.com/kata/546e2562b03326a88e000020

    public static int squareDigitsMy(int n) {

        StringBuilder result = new StringBuilder();
        String num = String.valueOf(n);

        for (int i = 0; i < num.length(); i++) {
            int i1 = Integer.parseInt(num.charAt(i) + "");
            result.append(i1 * i1);
        }
        return Integer.parseInt(result.toString());
    }

    //The best practice
    public static int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    public static void main(String[] args) {

        System.out.println(squareDigitsMy(9119));
        System.out.println(squareDigits(9119));

    }
}

