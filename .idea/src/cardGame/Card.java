package cardGame;

public abstract class Card {
    protected int suit;
    protected int rank;

    protected static enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS,
    }

    protected static enum Rank {
        VII,
        VIII,
        IX,
        X,
        J,
        Q,
        K,
        A,
    }

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}