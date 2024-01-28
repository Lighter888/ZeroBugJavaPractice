package Dmitrii.InterviewTasks;

import java.util.Arrays;

public class AlexInterview {
    public static void main (String[] args){
        int[] arr = {10, 15, 12, 7, 6, 32, 2};
        int target = 25;
        sumOfElements(arr, target);
    }
    public static void sumOfElements(int[] arr, int input) {
        int count = 0;
        int countElements = 0;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int sum;
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == input) {
                    System.out.println("Sum of Two elements " + arr[i] + " and " + arr[j] + " is equal: " + sum);
                }
            }
        }
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                String elements = "";
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    elements += arr[j] + ", ";
                    countElements++;
                    if (sum == input && countElements > 2) {
                        System.out.println("Sum of Several elements (" + elements.substring(0, elements.length()-2) + ") is equal: " + sum);
                        count++;
                    }
                }
            }
            if (count < 1) {
                System.out.println("Sorry, but none of array elements sum is equal: " + input);
            }
        }
    }

