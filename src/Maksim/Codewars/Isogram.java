package Maksim.Codewars;

public class Isogram {

    //https://www.codewars.com/kata/54ba84be607a92aa900000f1
    public static boolean isIsogram(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.toLowerCase().substring(i + 1).contains(str.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }
    public static boolean isIsogramBest(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    }

        public static void main(String[] args) {
        System.out.println(isIsogram("thumbscrewjapingly"));
    }
}
