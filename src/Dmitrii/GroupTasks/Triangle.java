package Dmitrii.GroupTasks;

import java.util.Scanner;

public class Triangle {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j1= n; j1 > i; j1--) {
                System.out.print(" ");
            }
            System.out.print("/");
            if(i==n-1){
                for (int j = 1; j <= n; j++) {
                    System.out.print("__");
                }
            } else{
                for (int j2= 0; j2 < i+i; j2++) {
                    System.out.print(" ");
                }
            }
            System.out.print("\\");
            System.out.println("");
            }
        }
    }

