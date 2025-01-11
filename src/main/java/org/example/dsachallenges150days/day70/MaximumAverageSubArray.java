package org.example.dsachallenges150days.day70;

public class MaximumAverageSubArray {

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double average = findMaxAverage(nums, k);
        System.out.println(average);
    }

    private static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for( int i =0; i<k; i++){
            windowSum += nums[i];
        }
        double maxAverage = (double) windowSum/k;

        for(int i = k; i<nums.length; i++){
            windowSum += nums[i]-nums[i-k];
            maxAverage = Math.max(maxAverage, (double) windowSum / k); // Update max average if needed
        }
        return maxAverage;
    }
}
