package org.example.dsachallenges150days.challenges.extra;

public class JavaSubstringComparision {

    /**
     * Lexicographical order for the given Data
     */

    public static void main(String[] args) {
        String message = "hello";
        int k = 3;
        String resultData = getSmallestAndLargest(message, k);
        System.out.println(resultData);

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i < s.length() - k + 1; i++) {
            largest = s.substring(i, i + k).compareTo(largest) > 0 ?
                    s.substring(i, i + k) :
                    largest;
            smallest = s.substring(i, i + k).compareTo(smallest) < 0 || i == 0 ?
                    s.substring(i, i + k)
                    : smallest;
        }
        return smallest + "\n" + largest;
    }
}
