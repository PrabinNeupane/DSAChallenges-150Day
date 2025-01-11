package org.example.dsachallenges150days.day70;

public class TestHello {
    public static void main(String[] args) {
        System.out.println("Hello World");


        // Test the solution
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Result: " + result[0] + ", " + result[1]);

    }

    static class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
            return result;
        }
    }

}
