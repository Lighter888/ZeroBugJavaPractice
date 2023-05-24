package Dmitrii.InterviewTasks;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main (String[] args){
        System.out.println(fibonacci(8));
    }

    public static List<Integer> fibonacci (int number){
       List <Integer> fibonacci = new ArrayList<>();
       int a = 0;
       int b = 1;
       int c = 0;
       fibonacci.add(b);
       for (int i = 1; i <= number; i++){
           c = a + b;
           a = b;
           b = c;
           fibonacci.add(c);
       }
       return fibonacci;
    }
}
