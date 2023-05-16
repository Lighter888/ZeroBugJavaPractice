package Dmitrii.GroupTasks.Tasks_41_60;

import java.util.Scanner;

public class Task_54 {

//    //54
//    Ask user enter 5 words and declare long word or Array
//    String h[]={"hellow", "whyyyyyyyyyy", "byererdddd", "apple" , "notettttt"};
//   ************ Looks like someone deleted end part of the task description!!!***********
//    It's suppose to be "found larger word from Array

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 words: ");
        System.out.println(largerWord(new String[]{scan.next(), scan.next(), scan.next(), scan.next(), scan.next()}));
    }

    public static String largerWord (String [] arrStr){
        String maxWord = "";
        for (int i = 0; i < arrStr.length; i++){
            if(arrStr[i].length() > maxWord.length()){
                maxWord = arrStr[i];
            }
        }
        return maxWord;
    }
}