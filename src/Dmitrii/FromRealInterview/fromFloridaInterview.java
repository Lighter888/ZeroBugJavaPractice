package Dmitrii.FromRealInterview;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fromFloridaInterview {
    /*
Given two lists of strings, how can I return a list of strings that are present in both lists? Do not use nested loops or 'contains' statements
     */
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        listOne.add("a");
        listOne.add("b");
        listOne.add("c");
        listTwo.add("e");
        listTwo.add("f");
        listTwo.add("a");
        listTwo.add("b");

        Set<String> set = new HashSet<>();
        List <String> onlyMatches = new ArrayList<>();
        for (String eachOne : listOne){
            set.add(eachOne);
        }
        for (String eachTwo : listTwo){
            if(!set.add(eachTwo))
            {
                onlyMatches.add(eachTwo);
            }
        }
        System.out.println(onlyMatches);
        }
    }

