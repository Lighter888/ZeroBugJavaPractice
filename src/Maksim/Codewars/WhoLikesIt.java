package Maksim.Codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class WhoLikesIt {
//    https://www.codewars.com/kata/5266876b8f4bf2da9b000362

    public static String whoLikesIt(String... names) {

        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> names[0] + " likes this";
            case 2 -> names[0] + " and " + names[1] + " like this";
            case 3 -> names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> names[0] + ", " + names[1] + " and " + (names.length - 2) + " others" + " like this";
        };
    }

    public static void main(String[] args) {

        System.out.println(whoLikesIt("Peter", "Jacob", "Mark", "Max", "Vadim"));
    }
}
