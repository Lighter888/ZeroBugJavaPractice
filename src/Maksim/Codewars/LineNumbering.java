package Maksim.Codewars;


import java.util.Arrays;
import java.util.List;

public class LineNumbering {

    //https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9
    public static List<String> number(List<String> lines) {

        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, (i+1) + ": " + lines.get(i));
        }
        return lines;
    }
    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
}
