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

    public Card() {

    }
    
    public abstract int getSuit();

    public abstract int getRank();
}