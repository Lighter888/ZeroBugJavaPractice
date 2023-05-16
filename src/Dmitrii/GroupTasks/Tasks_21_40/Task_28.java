package Dmitrii.GroupTasks.Tasks_21_40;

import java.util.*;

public class Task_28 {

//    //28  Find unique
//    String str = "accabbcd";
//    Map<Character, Integer> unique = new HashMap<>();
//
//    output
//    {d=1}

    public static void main (String[] args){
        String inputStr = "accabbcd";
        System.out.println(uniqueMap(inputStr));
    }
    public static Map<Character, Integer> uniqueMap (String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        Map<Character,Integer> newMap = new LinkedHashMap<>();
        for(int i  = 0; i < str.length(); i++){
            Character currentLetter = str.charAt(i);
            if(!map.containsKey(currentLetter)){
                map.put(currentLetter, 1);
            } else{
                map.put(currentLetter, map.get(currentLetter)+1);
            }
        }
        Set<Character> setKeys = map.keySet();
        for (Character key : setKeys) {
            if(!(map.get(key)>1)) newMap.put(key,(map.get(key)));
        }
        return newMap;
    }
}

