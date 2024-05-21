package org.example.dsachallenges150days;

import java.util.stream.Stream;

public class Check {
    public static void main(String[] args) {
        Stream.of(true, false, true)
                .map(b -> b.toString().toUpperCase())
                .peek(System.out::println);
    }
}
