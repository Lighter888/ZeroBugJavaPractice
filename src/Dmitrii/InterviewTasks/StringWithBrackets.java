package Dmitrii.InterviewTasks;

public class StringWithBrackets {

    public static void main(String[] args) {
        String str = "{{{{}()[[]]}}}";
        System.out.println(task(str));
    }
    public static boolean task (String str){

        int countL = 0;
        int countR = 0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='{'){
                countL++;
            }
            if(str.charAt(i)=='}'){
                countR++;
            }
        }
      return countL == countR;
    }
}
