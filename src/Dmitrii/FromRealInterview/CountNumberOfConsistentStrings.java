package Dmitrii.FromRealInterview;

public class CountNumberOfConsistentStrings {
    public static void main (String[] args){
        String [] words = {"ad","bd","aaab","baa","badab"};
        String allowed = "ab";
        System.out.println(countConsistentStrings(allowed, words));
    }

        public static int countConsistentStrings(String allowed, String[] words) {
            String [] letters = allowed.split("");
            int count = 0;
            for(String word : words){
                for(String letter : letters){
                    if(word.contains(letter)){
                        word = word.replaceAll(letter, "");
                    }
                }
                if(word.length() == 0){
                    count++;
                }
            }
            return count;
        }
}
