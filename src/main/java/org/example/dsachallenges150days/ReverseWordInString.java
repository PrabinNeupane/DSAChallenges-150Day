package org.example.dsachallenges150days;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseWordInString {
    public static void main(String[] args) {
        var s = "a good   example";
        var result = reverseWords(s);
        System.out.println(result);
    }

//    public static String reverseWords(String s) {
//        List<String> words = Arrays.stream(s.trim().split("\\s+"))
//                .collect(Collectors.toList());
//        Collections.reverse(words);
//        return String.join(" ", words);
//    }


    //use double pointer to get response like above method
    public static String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;
        // remove leading spaces
        while (left <= right && s.charAt(left) == ' ') ++left;

        // remove trailing spaces
        while (left <= right && s.charAt(right) == ' ') --right;

        Deque<String> d = new ArrayDeque();
        StringBuilder word = new StringBuilder();

        // push word by word in front of deque
        while (left <= right) {
            char c = s.charAt(left);

            if ((word.length() != 0) && (c == ' ')) {
                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());

        return String.join(" ", d);
    }

}

