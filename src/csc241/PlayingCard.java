package csc241;

public class PlayingCard implements Comparable<PlayingCard>{

    //String[] suits = {"Hearts", "Clubs", "Diamonda", "Spades"};
    private Suit suit;
    private Value value;

    public PlayingCard(Value value, Suit suit){
        this.value = value;
        this.suit = suit;
    }

    public String toString(){
        return value.name() + " of " + suit.toString();
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public int compareTo(PlayingCard other) {
        // Compare value
        if (value.compareTo(other.getValue()) == 0){
            // Same value
            return suit.compareTo(other.getSuit());
        } else {
            return value.compareTo(other.getValue());
        }
    }
}
