package Maksim.Extra_Tasks;

public class ReverseWordsInSentence {

    //https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
    public static String reverseWords(final String original) {
        String[] strArray = original.split(" ");
        StringBuilder result = new StringBuilder();

        for (String str: strArray) {
            result.append(new StringBuilder(str).reverse()).append(" ");
        }
        return (strArray.length == 0) ? original : result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
    }
}
