package Dmitrii.InterviewTasks;

public class CountLetterFromString {
    public static void main(String[] args) {
        String str = "aaasddadffgy";
        String newStr = "";
        for (int i = 0; i<str.length();i++){
            int count = 0;
            for (int j = 0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(!newStr.contains(str.charAt(i)+"")){
                newStr = newStr + str.charAt(i) + count;
            }
        }
        System.out.println(newStr);
    }
}
