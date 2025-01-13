package org.example.dsachallenges150days;


/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 * // It is sorted with no values equaling val.
 * <p>
 * int k = removeElement(nums, val); // Calls your implementation
 * <p>
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 */
public class DayTwoRemoveElementFromArray {

    public int removeElement(int[] nums, int val) {
        int variableCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = nums[variableCount];
                variableCount++;
            }
        }
        return variableCount;
    }


    public static void main(String[] args) {
        DayTwoRemoveElementFromArray obj = new DayTwoRemoveElementFromArray();
        int[] nums = new int[]{1, 9, 3, 4, 9, 6, 7, 8, 9, 10};
        int val = 9;
        System.out.println(obj.removeElement(nums, val));
    }
}
