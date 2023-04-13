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

        String sentence = "Today is great day";
        String [] arrSentence = sentence.split(" ");
        String newSentence = "";
        for (int i = arrSentence.length-1; i >= 0; i--) {
            newSentence = newSentence  + arrSentence[i] + " ";
        }
        System.out.println("Original text is: " + sentence);
        System.out.println("Reversed text is: " +newSentence);
    }





}
