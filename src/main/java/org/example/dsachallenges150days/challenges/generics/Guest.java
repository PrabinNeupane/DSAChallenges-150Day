package org.example.dsachallenges150days.challenges.generics;

public class Guest {
    public static void main(String[] args) {
        Glass<Juice> g = new Glass<Juice>();
        Juice juice = new Juice();
        g.liquid =juice;
        Juice j =  g.liquid;
    }
}
