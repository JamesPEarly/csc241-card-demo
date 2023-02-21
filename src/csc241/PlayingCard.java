package csc241;

public class PlayingCard implements Comparable<PlayingCard> {

    //String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
    private Suit suit;
    private Value cardValue;

    public PlayingCard(Value cardValue, Suit suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public String toString() {
        return cardValue.name() + " of " + suit.toString();
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getCardValue() {
        return cardValue;
    }

    @Override
    public int compareTo(PlayingCard other) {
        // Compare value
        int valueCompare = cardValue.compareTo(other.getCardValue());
        if (valueCompare != 0) {
            // use the card value to order
            return valueCompare;
        }
        // If we reach this point, the cards have the same value   
        return suit.compareTo(other.getSuit());
    }
}

