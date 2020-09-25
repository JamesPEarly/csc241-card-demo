package csc241;

public class Main {

    public static void main(String[] args) {

//        String s1 = "Good";
//        String s2 = "Bye";
//
//        System.out.println("COMPARE: " + s1.compareTo(s2));

        PlayingCard p1 = new PlayingCard(Value.SEVEN, Suit.DIAMONDS);
        PlayingCard p2 = new PlayingCard(Value.SEVEN, Suit.SPADES);
        System.out.println("COMPARE: " + p1.compareTo(p2));
    }
}
