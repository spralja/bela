package bela;

public enum Suit {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS,
    ;

    public static final int NUMBER_OF_SUITS = 4;

    public static Suit getByIndex(int index) {
        return switch(index) {
            case 0 -> SPADES;
            case 1 -> HEARTS;
            case 2 -> DIAMONDS;
            default -> CLUBS;
        };
    }

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