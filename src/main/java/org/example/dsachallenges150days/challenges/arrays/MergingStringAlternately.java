package org.example.dsachallenges150days.challenges.arrays;

public class MergingStringAlternately {
    public static void main(String[] args) {
        String firstString = "Hello";
        String secondString = "World";
        var solution = mergeStringAlternatively(firstString, secondString);
        System.out.println(solution);
    }

    static String mergeStringAlternatively(String firstString, String secondString) {
        StringBuilder mergedString = new StringBuilder();
        int indexFirst = 0;
        int indexSecond = 0;

        // Loop until we have exhausted both strings
        while (indexFirst < firstString.length() || indexSecond < secondString.length()) {
            // Append character from firstString if available
            if (indexFirst < firstString.length()) {
                mergedString.append(firstString.charAt(indexFirst));
                indexFirst++;
            }
            // Append character from secondString if available
            if (indexSecond < secondString.length()) {
                mergedString.append(secondString.charAt(indexSecond));
                indexSecond++;
            }
        }
        return mergedString.toString();
    }
}
