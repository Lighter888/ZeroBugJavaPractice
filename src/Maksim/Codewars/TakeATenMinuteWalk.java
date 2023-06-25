package Maksim.Codewars;

import java.util.List;
import java.util.stream.IntStream;

public class TakeATenMinuteWalk {

//    https://www.codewars.com/kata/54da539698b8a2ad76000228
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int countNS = 0, countWE = 0;
        for (char ch : walk) {
            if (ch == 'n') {
                countNS++;
            } else if (ch == 'w') {
                countWE++;
            } else if (ch == 's') {
                countNS--;
            } else if (ch == 'e') {
                countWE--;
            }
        }
        return (countNS == 0 && countWE == 0);
    }
    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));

    }
}
