package org.example.dsachallenges150days.challenges.arrays;

public class SubarrayPrinter {
    public static void printSubarrays(int[] arr) {
        printSubArraysHelper(arr, 0,
                new int[arr.length],
                0);
    }

    private static void printSubArraysHelper(int[] arr, int start, int[] subarr, int subLength) {
        if (start == arr.length) {
            if (subLength > 0) {
                // Print the subarray
                for (int i = 0; i < subLength; i++) {
                    System.out.print(subarr[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        // Exclude current element
        printSubArraysHelper(arr, start + 1, subarr, subLength);

        // Include current element
        subarr[subLength] = arr[start];
        printSubArraysHelper(arr, start + 1, subarr, subLength + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubarrays(arr);
    }
}
