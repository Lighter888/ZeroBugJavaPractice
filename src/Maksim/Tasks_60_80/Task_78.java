package Maksim.Tasks_60_80;

import java.util.HashMap;
import java.util.Map;

public class Task_78 {

    /*
    USE MAP
    int a = 25;
    int b = 10;

    you have 2 integers and with values assigned how would u add them without + sign
    result = 35;
    then subtract
    result = 15;
     */

    public static void main(String[] args) {

        int a = 25;
        int b = 10;

        Map<String,Integer> map = new HashMap<>();
        map.put("a",a);
        map.put("b",b);

        map.put("result", Math.addExact(a,b));
        System.out.println("result = " + map.get("result"));
        map.put("result", Math.subtractExact(a,b));
        System.out.println("result = " + map.get("result"));


    }
}
