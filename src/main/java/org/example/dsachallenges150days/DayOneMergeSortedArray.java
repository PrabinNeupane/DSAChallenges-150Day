package org.example.dsachallenges150days;

class DayOnrMergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for the last valid element in nums1
        int p2 = n - 1; // Pointer for the last element in nums2
        int p = m + n - 1; // Pointer for the last position in nums1

        // Merge in reverse order
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }

        // If there are remaining elements in nums2, add them
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
        // No need to handle nums1 since it's already in place
        for (int element : nums1) {
            System.out.print(p + " ");
        }
    }

    public static void main(String[] args) {
        DayOnrMergeSortedArray solution = new DayOnrMergeSortedArray();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        solution.merge(nums1, nums1.length, nums2, nums2.length);
    }

}