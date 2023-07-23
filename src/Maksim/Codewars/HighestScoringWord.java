package Maksim.Codewars;

public class HighestScoringWord {

    public static String high(String s) {

        int score = 0;
        int maxScore = Integer.MIN_VALUE;
        String result = "";

        for (String string : s.split(" ")) {
            for (int i = 0; i < string.length(); i++) {
                score += (string.charAt(i) - 96);
            }
            if (score > maxScore) {
                maxScore = score;
                result = string;
            }
            score = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(high("today is a good day"));
    }
}
