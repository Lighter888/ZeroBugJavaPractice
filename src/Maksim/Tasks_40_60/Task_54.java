package Maksim.Tasks_40_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_54 {

    /*
    Ask user enter 5 words and declare long word or Array
    String h[]={"hellow", "whyyyyyyyyyy", "byererdddd", "apple" , "notettttt"};
     */


    public static void getMaxLengthWord() {

        String maxSrt = "";

        Scanner scan = new Scanner(System.in);
        String[] arr = new String[5];
//        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter word # " + (i + 1) + ": ");
            arr[i] = scan.nextLine();
                if (maxSrt.length() < arr[i].length()) {
                    maxSrt = arr[i];
//                    list.add(maxSrt);
                }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max length strings in the Array is :" + maxSrt);
    }
    public static void main(String[] args) {

        getMaxLengthWord();
    }
}
