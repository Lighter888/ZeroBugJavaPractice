package Dmitrii.InterviewTasks;

import java.util.StringTokenizer;

public class RemoveExtraSpaces {
    public static void main (String[] args){

        String str = "Try     to       remove          extra       spaces.";
        String strNew = str;
        while (strNew.contains("  ")) {
            strNew = strNew.replace("  ", " ");
        };
        System.out.println(str);
        System.out.println(strNew);


//        StringTokenizer substr = new StringTokenizer(input, " ");
//        StringBuffer sb = new StringBuffer();
//
//        while(substr.hasMoreElements()){
//            sb.append(substr.nextElement()).append(" "); }
//
//        System.out.println("Actual string: " + input);
//        System.out.println("Processed string: " + sb.toString().trim());
       }
    }
