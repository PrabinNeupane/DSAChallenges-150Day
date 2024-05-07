package org.example.dsachallenges150days.challenges.arrays.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solutions {
    public static void main(String[] args) {

        var result = kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        result.forEach(System.out::println);

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies)
                .mapToObj(candy -> candy + extraCandies >= max)
                .collect(Collectors.toList());

    }


}
