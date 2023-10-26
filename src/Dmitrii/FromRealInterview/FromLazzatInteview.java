package Dmitrii.FromRealInterview;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FromLazzatInteview {
    public static void main(String[] args){
//        String[] str = {"pack my box with five dozen liquor jugs", "this is not a pangram"};
//        System.out.println("Result of your elements of Pangram List is : " + isPangram(str));
        int[] arr2 = {3,5,6,4,2};
        int[] arr1 = {4,2,3,6,7,5,1};
        System.out.println(getsArrayDuplicate(arr1, arr2));


    }

    // Task 1
    public static List<Boolean> isPangram (String[] str){
        boolean flag = true;
        String abc = "abcdefghijklmnopqrstuvwxyz";
        List <Boolean> result = new ArrayList<>();
        for (String s : str) {
            String[] chars = abc.split("");
            for (String eachChar : chars) {
                if (!s.contains(eachChar)) {
                    flag = false;
                    break;
                }
            }
            result.add(flag);
            flag = true;
        }
        return result;
    }

    // Task 2

    public static  Set<Integer> getsArrayDuplicate (int[] arr1, int[] arr2) {
        Set<Integer> result = new HashSet<>();
     if (arr1.length <= arr2.length){
         for (int i = 0; i < arr1.length; i++) {
             for (int j = 0; j < arr2.length; j++) {
                 if(arr1[i]==arr2[j]){
                     result.add(arr1[i]);
                 }
             }
         }
     } else {
         for (int i = 0; i < arr2.length; i++) {
             for (int j = 0; j < arr1.length; j++) {
                 if(arr1[j]==arr2[i]){
                     result.add(arr2[i]);
                 }
             }
         }
     }
        return result;
    }
}