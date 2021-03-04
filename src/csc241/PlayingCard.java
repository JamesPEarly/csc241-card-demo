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
        int valueCompare = value.compareTo(other.getValue());
        if (valueCompare == 0){
            // Same value
            return valueCompare);
        }     
        // If we reach this point, the cards have the same value   
            return suit.compareTo(other.getSuit());
        }
    }
}
