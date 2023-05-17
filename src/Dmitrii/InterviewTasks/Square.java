package Dmitrii.InterviewTasks;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 0; i < input; i++) {
            if (i == 0) {
                for (int j = 0; j < input; j++) {
                    System.out.print("*  ");
                }
                System.out.println(" ");
            } else if (i == input - 1) {
                for (int j = 0; j < input; j++) {
                    System.out.print("*  ");
                }
            } else{
                System.out.print("*");
                for (int j = 0; j < input-2; j++) {
                    System.out.print("   ");
                }
                System.out.print("  *");
                System.out.println("");
            }
        }
    }
}
