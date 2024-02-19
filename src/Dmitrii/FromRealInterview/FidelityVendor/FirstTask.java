package Dmitrii.Lambda_PojoBean_MethodReferenceOperator_etc.Lambda;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Interview {
    public static void main (String[] args){
        returnLetters1(10);
        returnLetters2(1);
    }
    public static void returnLetters1 (int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqr");
        map.put(8, "stu");
        map.put(9, "xyz");

        for (int n : map.keySet()) {
            if (n == num) {
                System.out.println(map.get(n));
            }
        }
        if (num < 2 || num >9){
            System.out.println("No no no! Wrong number, please use number from 2 to 9!");
        }
    }

    public static void returnLetters2 (int num){
        switch (num){
            case 2:
                System.out.println("abc");
                break;
            case 3:
                System.out.println("def");
                break;
            case 4:
                System.out.println("ghi");
                break;
            case 5:
                System.out.println("jkl");
                break;
            case 6:
                System.out.println("mno");
                break;
            case 7:
                System.out.println("pqr");
                break;
            case 8:
                System.out.println("stu");
                break;
            case 9:
                System.out.println("xyz");
                break;
            default:
                System.out.println("Wrong number! Please use number from 2 to 9!");
                break;
        }
    }
}
