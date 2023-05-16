package Maksim.Tasks_20_40;

public class Task_32 {

    /*
    Create a function that counts the number of syllables a word has. Each syllable is
    separated with a dash "-" Examples
    numberSyllables("buf-fet") ➞ 2

    String q="buf-dt-rr"; >> 3
     */

    public static int syllables(String word) {

        return word.split("-").length;
    }
    public static void main(String[] args) {

        System.out.println(syllables("buf-dt-rr"));
    }
}
