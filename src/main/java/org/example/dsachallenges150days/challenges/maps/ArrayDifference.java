package org.example.dsachallenges150days.challenges.maps;

import java.util.*;

class ArrayDifference {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        var result = findDifference(nums1, nums2);
        result.forEach(System.out::println);
    }

    static List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<>();

        for (int num : nums1) {
            boolean existInNums2 = false;
            for (int x : nums2) {
                if (x == num) {
                    existInNums2 = true;
                    break;
                }
            }

            if (!existInNums2) {
                onlyInNums1.add(num);
            }
        }
        return new ArrayList<>(onlyInNums1);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2),
                getElementsOnlyInFirstList(nums2, nums1));
    }
}