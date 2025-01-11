package org.example.dsachallenges150days.day70;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 7, 9, 5};

        Arrays.sort(nums);

        int[] result = monotonicStack(nums);
        System.out.print("Monotonic increasing stack: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static int[] monotonicStack(int[] nums) {
        Deque<Integer> monotonicStack = new ArrayDeque<>();
        for (int num : nums) {
            System.out.println(monotonicStack.peekLast());
            while (!monotonicStack.isEmpty() && monotonicStack.peekLast() > num) {
                monotonicStack.pollLast();
            }
            monotonicStack.offerLast(num);
        }
        return monotonicStack.stream().mapToInt(i -> i).toArray();
    }
}
