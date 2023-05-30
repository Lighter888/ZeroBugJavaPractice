package Maksim.Tasks_60_80;

public class Task_61 {

    /*
        write a program that can return the number of appearances of
        "java" and "python" anywhere in the sentence---"I Like java and javascript not python";
        You will do for each and regular for loop
        for each result:    java 2
                            python 1
     */

    public static void getRepeatStr(String string) {

        String java = "java";
        int javaCount = 0;
        String python = "python";
        int pythonCount = 0;
        string += "  ";

        for (int i = 0; i <= string.length()-6; i++) {
            if (java.equals(string.substring(i,i+4))) {
                javaCount++;
            }
            if (python.equals(string.substring(i,i+6))){
                pythonCount++;
            }
        }

        System.out.println(java +" "+ javaCount);
        System.out.println(python +" "+ pythonCount);
    }

    public static void main(String[] args) {

        getRepeatStr("I Like java and javascript not python");
    }
}
