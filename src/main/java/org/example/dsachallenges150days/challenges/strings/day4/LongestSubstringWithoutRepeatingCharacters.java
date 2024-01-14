package org.example.dsachallenges150days.challenges.strings.day4;

import java.util.HashMap;

/**
 * Given a string s , find the length of the longest substring without repetating
 * characters
 * Input: s ="abcabcbb"
 * output : 3
 * Explaination: The answer is "abc", with the lengeht of 3
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public static void main(String[] args) {
        String s = "abcabcbb";
        int repetation = longestSubstringOfRepeatingCharacter(s);
        System.out.println(repetation);
    }

    private static int longestSubstringOfRepeatingCharacter(String s) {

        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(charIndexMap.get(currentChar) + 1, left);
            }
            maxLength = Math.max(maxLength, right - left + 1);
            charIndexMap.put(currentChar, right);
        }

        return maxLength;
    }
}