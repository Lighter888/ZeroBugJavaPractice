package Dmitrii.GroupTasks.Tasks_21_40;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_27 {

//    //27 frequency
//    String str="AABBDDDC";
//    Map<Character, Integer> map = new LinkedHashMap<>();
//    output
//    {A=2, B=2, D=3, C=1}

   public static void main(String[] args){
       String inputStr = "Dmittttrii";
       System.out.println(countOfLetters(inputStr));
   }

   public static Map<Character, Integer> countOfLetters (String str){
       Map<Character,Integer> map = new LinkedHashMap<>();
       for(int i  = 0; i < str.length(); i++){
           Character currentLetter = str.charAt(i);
           if(!map.containsKey(currentLetter)){
               map.put(currentLetter, 1);
           } else{
               map.put(currentLetter, map.get(currentLetter)+1);
           }
       }
       return map;
   }
}
