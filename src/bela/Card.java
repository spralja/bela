package bela;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int value(Suit trumpSuit) {
        return -1;
    }

    public boolean beats(Card that, Suit trumpSuit) {
        return false;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString(Suit trumpSuit) {
        StringBuilder string = new StringBuilder();
        return string.append(rank.toString(trumpSuit)).append(suit.toString(trumpSuit)).toString();
    }
}
