package bela;

public enum Rank {
    VII,
    VIII,
    IX,
    X,
    J,
    Q,
    K,
    A,
    ;

    public String toString(Suit trumpSuit) {
        return switch(this) {
            case VII -> "VII";
            case VIII -> "VIII";
            case IX -> "IX";
            case X -> "X";
            case J -> "J";
            case Q -> "Q";
            case K -> "K";
            case A -> "A";
        };
    }
}
