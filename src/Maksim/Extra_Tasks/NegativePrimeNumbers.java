package Maksim.Extra_Tasks;

import java.util.*;

public class NegativePrimeNumbers {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> getFirstNNegativePrimes(int N) {
        ArrayList<Integer> negativePrimes = new ArrayList<>();
        int count = 0;
        int num = -2; // Start checking from -2, as -1 is not considered prime.

        while (count < N) {
            if (isPrime( (-1)*num)) {
                negativePrimes.add(num);
                count++;
            }
            num--;
        }

        return negativePrimes;
    }

    public static int[] getNumSum(int[] arr, int sum) {

        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    res[0] = arr[i];
                    res[1] = arr[j];
                    return res;
                }
            }
        }
        return res;
    }



    int[] twoSum(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            if (set.contains(numberToFind)) {
                return new int[] {numberToFind, nums[i]};
            }
            set.add(nums[i]);
        }
        return new int[0];
    }

    static int[] twoSum1(int[] nums, int k){

        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == k) {
                return new int[] {nums[l], nums[r]};
            }
            if (sum < k) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int N = 3; // Replace 10 with your desired value of N
        ArrayList<Integer> negativePrimes = getFirstNNegativePrimes(N);

        System.out.println("First " + N + " negative prime numbers are:");
        for (int prime : negativePrimes) {
            System.out.print(prime + " ");
        }
        System.out.println(Arrays.toString(getNumSum(new int[]{1, 2, 3, 3, 5, 6}, 5)));
        System.out.println(Arrays.toString(twoSum1(new int[]{1, 2, 3, 3, 5, 6}, 5)));

        String input = "Try     to remove     extra     spaces.";
        String inputNew = input;
        while (inputNew.contains("  ")) {
            inputNew = inputNew.replace("  ", " ");
        };
        System.out.println(input);
        System.out.println(inputNew);

    }
}
