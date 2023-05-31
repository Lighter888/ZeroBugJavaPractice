package Dmitrii.InterviewTasks;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main (String[] args){
        System.out.println(fibonacci(5));
    }

    public static List<Integer> fibonacci (int number){
       List <Integer> fibonacciList = new ArrayList<>();

//       // IQ Solution
//       int a = 0;
//       int b = 1;
//       int c = 0;
//       for (int i = 1; i <= number; i++){
//           c = a + b;
//           a = b;
//           b = c;
//           fibonacciList.add(c);
//       }


        // Dima Solution
        if(number <= 0){
            return null;
        } else if(number == 1 || number == 2){
            for(int i = 1; i <= number; i++){
                fibonacciList.add(i);
            }
        } else {
            fibonacciList.add(1);
            fibonacciList.add(2);
            for(int i = 1; i <= number; i++){
               int sum = fibonacciList.get(i-1) + fibonacciList.get(i);
                fibonacciList.add(sum);
            }
        }


       return fibonacciList;
    }
}
