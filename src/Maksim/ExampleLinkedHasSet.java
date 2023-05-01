package Maksim;

import java.util.*;

public class ExampleLinkedHasSet {

    public static void main(String[] args) {

        String str="dddaaabbcfffgg";
        String result="";  //d3a3b2c1f3g2

        List<String> stringsList = Arrays.asList(str.split(""));

        System.out.println(stringsList);

        for (String each : stringsList) {

            int freq= Collections.frequency(stringsList,each);
            if(!result.contains(each)) {
                result += each + freq;
            }
        }
        System.out.println(result);;
    }
}
