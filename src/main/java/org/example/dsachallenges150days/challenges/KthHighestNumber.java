package org.example.dsachallenges150days.challenges;

public class KthHighestNumber {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        var result = findKthLargest(nums, k);
        System.out.println(result);
    }

    public static int findKthLargest(int[] nums, int k) {
        var sortedArray = quickSortElement(nums,
                0,
                nums.length - 1);
        return sortedArray[nums.length - k];
    }

    private static int[] quickSortElement(int[] nums, int start, int end) {

        if (start < end) {
            int partitionIndex = partition(nums, start, end);
            quickSortElement(nums, start, partitionIndex - 1);
            quickSortElement(nums, partitionIndex + 1, end);
        }
        return nums;
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = temp;
        return i + 1;
    }

}
