package Maksim;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Trainer {

    static int sumOfDigits(String str) {

        String dig = "";
        List<String> list = new ArrayList<>();
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                dig += ch;
            } else {
                if (dig.isEmpty()) {
                    continue;
                }
                list.add(dig);
                dig = "";
            }
        }
        System.out.println(list);

        return list.stream().mapToInt(Integer::parseInt).sum();
    }

    public static boolean scramble(String str1, String str2) {
        for (String ch: str2.split("")) {
            if (!str1.contains(ch)){
                return false;
            }
            str1 = str1.replaceFirst(ch, "");
        }
        return true;
    }

    public static boolean scramble1(String str1, String str2) {
        StringBuilder str1Builder = new StringBuilder(str1);

        for (String ch : str2.split("")) {
            int index = str1Builder.indexOf(ch);
            if (index == -1) {
                return false;
            }
            str1Builder.deleteCharAt(index);
        }

        return true;
    }

    public static int lastDigit(BigInteger n1, BigInteger n2) {
        return n1.pow(n2.intValue()).intValue()%10;
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits("A10B3C200AasAAA1"));

        System.out.println(scramble1("scriptingjava","javascript"));
    }
}
