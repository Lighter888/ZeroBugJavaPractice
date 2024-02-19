package Dmitrii.InterviewPrep;

public class ConvertStringToArray {
    public static void main(String[]args){
        String str = "Convert me to array";
        char [] chars = str.toCharArray();
        for(char each : chars){
            System.out.print(each + " ");
        }
    }
}
