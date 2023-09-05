package Dmitrii.GroupTasks;

public class Maks8_9_23 {
    public static void main(String[] args){
        String str = "a30d4g5h6";
        String newStr = "";
        newStr = str.replaceAll("[a-zA-Z]", "");
        int sum = 0;
        for(String ch : newStr.split("")){
            sum += Integer.parseInt(ch);
        }
        System.out.println(sum);
        System.out.println(str.length());
        int [] a = new int [1];
        System.out.println(a.length);
    }
}
