package Maksim.Tasks_0_20;

import java.util.*;

public class Task_1 {
    /*
    YOU WILL USE 3 WAY TO DO THAT.
    1 WHILE LOOP  2 FOR LOOP AND  3 FOR LOOP by using "FREQUENCY"
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String freqCharOfStrC(String str) {

        StringBuilder newStr = new StringBuilder();
        List<String> list = Arrays.asList(str.split(""));
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        for (String s : set) {
            newStr.append(s).append(Collections.frequency(list,s));
        }
        return newStr.toString();
    }
    public static String freqCharOfStrF(String str) {

        StringBuilder newStr = new StringBuilder();
        str += " ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                newStr.append(str.charAt(i)).append(count);
                count = 1;
            }else {
                count++;
            }
        }
        return newStr.toString();
    }
    public static String freqCharOfStrW(String str) {

        StringBuilder newStr = new StringBuilder();
        str += " ";
        int i = 0;
        int count = 1;
        while (i < str.length() - 1) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                newStr.append(str.charAt(i)).append(count);
                count = 1;
            }else {
                count++;
            }
            i++;
        }
        return newStr.toString();
    }

    public static void main(String[] args) {

        System.out.println(freqCharOfStrF("AAABBCDD"));
        System.out.println(freqCharOfStrC("AAABBCDD"));
        System.out.println(freqCharOfStrW("AAABBCDD"));
    }
}
