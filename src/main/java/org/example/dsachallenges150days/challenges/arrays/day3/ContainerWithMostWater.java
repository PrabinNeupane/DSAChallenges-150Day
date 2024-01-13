package org.example.dsachallenges150days.challenges.arrays.day3;


import java.math.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxWater = calculateMaximumContainerWithWater(height);
        System.out.println(maxWater);
    }

    private static int calculateMaximumContainerWithWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}