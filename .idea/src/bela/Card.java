package bela;

public class Card {
    private int suit;
    private int rank;

    public enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS,
    }

    public enum Rank {
        VII,
        VIII,
        IX,
        X,
        J,
        Q,
        K,
        A,
    }

    private int power(int trumpSuit) {
        return -1;
    }

    public int value(int trumpSuit) {
        return -1;
    }

    public boolean beats(Card that, int trumpSuit) {
        return false;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public String toString(int trumpSuit) {
        return "";
    }
}
