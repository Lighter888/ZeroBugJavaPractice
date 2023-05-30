package Maksim.Tasks_40_60;

import javax.swing.plaf.IconUIResource;

public class Task_51 {

    /*
    We'll say that a "triple" in a string is a char appearing three times
    in a row. Print out the number of triples in the given string.
    The triples may overlap. Example:input: abcXXXabc output: 1
     */

    public static int getTriple(String string) {

        int count = 0;

        for (int i = 0; i < string.length() - 2; i++) {
            if ((string.charAt(i) == string.charAt(i + 1)) && (string.charAt(i + 1) == string.charAt(i + 2))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(getTriple("abcXXXabbbb"));
    }
}
