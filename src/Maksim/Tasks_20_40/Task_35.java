package Maksim.Tasks_20_40;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_35 {
    /*
//    String s = "Seda, 20, Leyla, 30";
//
//    First output
//    {Seda= 20,  Leyla= 30}
//
//    Second
//    String str = "Seda, Nurik, Leyla, Seda";
//    {Seda=,  Nurik=,  Leyla=,  Seda=}
     */

    public static Map<String, String> getLibraryFirst(String string) {

        Map<String, String> library = new LinkedHashMap<>();
        String[] individualStr = string.split(",");
        for (int i = 0; i < individualStr.length; i++) {
            if (i % 2 == 0) {
                library.put(individualStr[i], individualStr[i+1]);
            }
        }
        return library;
    }

    public static Map<String, String> getLibrarySecond(String string) {

        Map<String, String> library = new LinkedHashMap<>();
        String[] individualStr = string.split(",");
        for (String s : individualStr) {
            library.put(s, "");
        }
        return library;
    }

    public static void main(String[] args) {

        String s = "Seda, 20, Leyla, 30";
        System.out.println(getLibraryFirst(s));

        String str = "Seda, Nurik, Leyla, Seda";
        System.out.println(getLibrarySecond(str));

    }
}
