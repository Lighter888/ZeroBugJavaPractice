package Maksim.Extra_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void reverseStringUseStream(String str) {

        String reverse = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("reverse via stream = " + reverse);
    }
    public static void main(String[] args) {

        reverseStringUseStream("Hello world!");

        String input = "Hello world!";
        List<Character> arrList = new ArrayList<>();
        StringBuilder reverse = new StringBuilder();

        for (char c : input.toCharArray()) {
            arrList.add(c);
        }
        Collections.reverse(arrList);

        for (Character character : arrList) {
            reverse.append(character);
        }
        System.out.println("reverse classic way= " + reverse);


        // solution in one string using StringBuilder class
        String reverseNew = new StringBuilder(input).reverse().toString();

        System.out.println("reverseNew using StringBuilder= " + reverseNew);
    }
}
