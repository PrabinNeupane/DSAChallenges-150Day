package org.example.dsachallenges150days;
import java.util.Arrays;


public class DayOneMergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the arrays until one is exhausted
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Add remaining elements from nums1 (if any)
        while (i < m) {
            result[k++] = nums1[i++];
        }

        // Add remaining elements from nums2 (if any)
        while (j < n) {
            result[k++] = nums2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7, 9};
        int[] nums2 = {2, 4, 6, 8, 10};
        int m = nums1.length;
        int n = nums2.length;

        DayOneMergeSortedArray d = new DayOneMergeSortedArray();
        Arrays.stream(d.merge(nums1, m, nums2, n)).forEach(System.out::println);
    }
}
