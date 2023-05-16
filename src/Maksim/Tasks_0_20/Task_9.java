package Maksim.Tasks_0_20;

import java.util.Arrays;

public class Task_9 {

    /*
    String str="DC501GCCCA098911";

    output
    CD015ACCCG011899
     */

    public static void stringSorting(String str) {

        StringBuilder result = new StringBuilder();
        str += " ";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result.append(str.charAt(i));
            }
            if (Character.isLetter(str.charAt(i))) {
                result.append(str.charAt(i));
            }
            if ( (Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i + 1)))
                    || (Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(i + 1))) ) {
                result.append(" ");
            }
        }
        System.out.println(result);

        String[] charStr = result.toString().split(" ");
        System.out.println(Arrays.toString(charStr));
        result.delete(0,result.capacity());

        for (String st : charStr) {
            char[] characters = st.toCharArray();
            Arrays.sort(characters);
            for (char singleChar : characters) {
                result.append(singleChar);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        stringSorting("DC501GCCCA098911");
    }
}
