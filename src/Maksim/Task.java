package Maksim;

import java.util.*;

public class Task {

    static boolean isValid(String s) {
        while ((s.contains("{}")) || (s.contains("()")) || (s.contains("[]"))){
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.length()==0;
    }

    public static void main(String[] args) {

        System.out.println(isValid("[][]]"));

        System.out.println(maxProfit(new int[] {7,1,5,3,6,4,6,7,3,2,7,99,}));


        String[] testArray = {"Apple", "Banana", "Apple", "Cherry"};
        String res = "";
        int count = 1;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = i + 1; j < testArray.length; j++) {
                if (testArray[i].equals(testArray[j])) {
                    count++;
                }
            }
            if (!res.contains(testArray[i])) {
                res += testArray[i] + " = " + count + " ";
            }
            count = 1;
        }
        System.out.println(res);


    Map<String, Integer> map = new HashMap<>();
    List<String> list = List.of(testArray);
        for (String s : list) {
            map.put(s , Collections.frequency(list, s));
        }
        System.out.println(map);
    }

    static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (profit < prices[j] - prices[i]) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
    public boolean isPalindrome(int x) {
        String orig = String.valueOf(x);
        StringBuilder builder = new StringBuilder(orig);
        builder.reverse();
        return orig.contentEquals(builder);
    }

}
