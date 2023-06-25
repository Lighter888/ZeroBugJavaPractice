package Maksim.Codewars;

public class YourOrderPlease {
    //https://www.codewars.com/kata/55c45be3b2079eccff00010f
    public static String order(String words) {
        String[] strArray = words.split(" ");
        String[] resultArray = new String[strArray.length];
        for (String str : strArray) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    resultArray[Integer.parseInt(str.charAt(i) + "") - 1] = str;
                }
            }
        }
        return words.isEmpty() ? "" : String.join(" ", resultArray).trim();
    }

    public static void main(String[] args) {
        System.out.println(order(""));
    }
}
