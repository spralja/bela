package bela;

public enum Suit {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS,
    ;

    public String toString(Suit trumpSuit) {
        if(this == trumpSuit) {
            return switch(this) {
                case SPADES -> "♠";
                case HEARTS -> "♥";
                case DIAMONDS -> "♦";
                case CLUBS -> "♣";
            };
        } else {
            return switch(this) {
                case SPADES -> "♤";
                case HEARTS -> "♡";
                case DIAMONDS -> "♢";
                case CLUBS -> "♧";
            };
        }
    }
}