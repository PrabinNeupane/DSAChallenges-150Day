package org.example.dsachallenges150days.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MoveZeroes<K, V> {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    private static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        if (nums.length == 1) return;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }
        //remove all zeroes
        nums = Arrays.stream(nums).filter(num -> num != 0).toArray();
        //add zeroes at the end
        for (int i = 0; i < zeroCount; i++) {
            nums = Arrays.copyOf(nums, nums.length + 1);
            nums[nums.length - 1] = 0;
        }
        System.out.println(Arrays.toString(nums));

    }

}

