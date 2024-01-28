package Dmitrii.InterviewTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TofigTask {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        int[] topThree = threeTopElements(arr);

        System.out.println("Three top elements are: ");
        for (int element : topThree) {
            System.out.println(element);
        }
    }

    public static int[] threeTopElements(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Use a priority queue to get the top three elements
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        );

        maxHeap.addAll(frequencyMap.entrySet());

        // Extract the top three elements
        int[] topThree = new int[Math.min(3, maxHeap.size())];
        for (int i = 0; i < topThree.length; i++) {
            topThree[i] = maxHeap.poll().getKey();
        }

        return topThree;
    }
}
