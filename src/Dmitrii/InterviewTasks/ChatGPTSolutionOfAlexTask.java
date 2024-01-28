package Dmitrii.InterviewTasks;

import java.util.ArrayList;
import java.util.List;

public class ChatGPTSolutionOfAlexTask {
    public static void main(String[] args) {
        int[] arr = {10, 15, 12, 7, 8, 6, 32, 2};
        int targetSum = 25;

        List<List<Integer>> subsets = findSubsetsWithSum(arr, targetSum);

        System.out.println("Subsets with sum 25:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> findSubsetsWithSum(int[] arr, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, targetSum, result, new ArrayList<>(), 0);
        return result;
    }

    private static void backtrack(int[] arr, int target, List<List<Integer>> result, List<Integer> current, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (target - arr[i] >= 0) {
                current.add(arr[i]);
                backtrack(arr, target - arr[i], result, current, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }
}
