package Maksim.Extra_Tasks;

import java.util.ArrayList;

public class Fibanacci {

    public static ArrayList<Integer> createFibonacciNumbers(int n){

        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i <= n; i++) {
            list.add(list.get(i - 2) + list.get(i - 1));
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(createFibonacciNumbers(10));
    }
}
