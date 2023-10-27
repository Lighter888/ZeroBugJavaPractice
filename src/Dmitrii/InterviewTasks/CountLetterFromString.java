package Dmitrii.InterviewTasks;

public class CountLetterFromString {
      /*
         Write a script that takes in a string input from the user and then prints out the input in the format of {first letter}{times it occurs consecutively}{Second Letter (not matching the first)}{times is occurs consecutively} and so on.

         Example input: aaleeexxssa

         Example Output: a2l1e3x2s2a1
      */
    public static void main(String[] args) {
        String str = "aaleeexxssa";
        String newStr = "";
        for (int i = 1; i<str.length();i++){
            int count = 0;

                if(str.charAt(i-1)==str.charAt(i)){
                    count++;
                    newStr = newStr + str.charAt(i) + count;
            }
        }
        System.out.println(newStr);
    }
}
