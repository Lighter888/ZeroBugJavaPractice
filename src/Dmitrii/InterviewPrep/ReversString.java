package Dmitrii.InterviewPrep;

public class ReversString {
    public static void main(String[]args) {
        String str = "Revers me";
        System.out.println(revers(str));
    }

    public static String revers(String input){
        // String Builder version
//        StringBuilder sb = new StringBuilder(input);
//        return sb.reverse().toString();

        // String Array version
//        String revStr = "";
//        char[] letters = input.toCharArray();
//        for(int i = letters.length-1; i >=0; i--)   {
//            revStr += letters[i];
//        }
//        return revStr;

//        // CharAt version
//        String revStr = "";
//        for (int i = input.length()-1; i >= 0; i--){
//            revStr += input.charAt(i);
//        }
//        return revStr;

        //Revers only letters in words but word should be in same place
        String [] words = input.split(" ");
        String rewLettersInWords = "";
        for(int i = 0; i < words.length; i++){
            for(int j = words[i].length()-1; j >= 0 ; j--) {
                rewLettersInWords += words[i].charAt(j);
            }
            rewLettersInWords += " ";
        }
        return rewLettersInWords.trim();
    }
}
