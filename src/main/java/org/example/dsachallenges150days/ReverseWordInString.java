package org.example.dsachallenges150days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordInString {
    public static void main(String[] args) {
        var s = "a good   example";
        var result = reverseWords(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        List<String> words = Arrays.stream(s.trim().split("\\s+"))
                .collect(Collectors.toList());
        Collections.reverse(words);
        return String.join(" ", words);
    }
}

