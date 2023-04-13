package Dmitrii.GroupTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_59 {
    /*
       59
       String sentence = "Today is great day";
       Array [Today, is, great, day]
       reverse Array[Today, is, great, day] to >  day great is Today
    */

    public static void main(String[] args){
        System.out.println("*********************************************************");
        //Solution1 revers the words in the sentence
        String sentence = "Today is great day";
        String [] arrSentence = sentence.split(" ");
        String newSentence = "";
        for (int i = arrSentence.length-1; i >= 0; i--) {
            newSentence = newSentence  + arrSentence[i] + " ";
        }
        System.out.println("Original text is: " + sentence);
        System.out.println("Reversed text is: " +newSentence);

        System.out.println("*********************************************************");

        //Solution2 revers the letters into words but save words on the original place
        String sentence1 = "Today is great day";
        String [] arrSentence1 = sentence1.split(" ");
        String newSentence1 = "";
        for(int i = 0; i< arrSentence1.length; i++){
            for (int j = arrSentence1[i].length()-1; j >= 0; j--) {
                newSentence1 = newSentence1 + arrSentence1[i].charAt(j);
            }
            newSentence1 = newSentence1 + " ";
        }
        System.out.println("Original sentence1 is:       " + sentence1);
        System.out.println("Reversed words sentence1 is: " + newSentence1);
        System.out.println("*********************************************************");
    }
    // Added new comment
}
