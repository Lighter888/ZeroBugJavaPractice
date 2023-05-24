package Maksim.Tasks_40_60;

import java.util.Arrays;

public class Task_47 {

    /*
    This task  = #9
    Given alphanumeric String, we need to split the string into substrings of consecutive
    letters or numbers, sort the individual string and append them back together
    Input:  "D5C01GCCCA098911"
    OutPut: "CD015ACCCG011899"
     */

    /**
     * This function perform sorting input string
     * @param str
     * @return Sorting string
     */
    public static StringBuilder alphanumericString(String str) {

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

        String[] charStr = result.toString().split(" ");
        result.delete(0,result.capacity());

        for (String st : charStr) {
            char[] characters = st.toCharArray();
            Arrays.sort(characters);
            for (char singleChar : characters) {
                result.append(singleChar);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(alphanumericString("D5C01GCCCA098911"));

    }
}
