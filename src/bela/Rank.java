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

    public static final int NUMBER_OF_RANKS = 8;

    public static Rank getByIndex(int index) {
        return switch(index) {
            case 0 -> VII;
            case 1 -> VIII;
            case 2 -> IX;
            case 3 -> X;
            case 4 -> J;
            case 5 -> Q;
            case 6 -> K;
            default -> A;
        };
    }

    public int value(boolean isTrumpSuit) {
        if(isTrumpSuit) {
            return switch(this) {
                case VII, VIII -> 0;
                case IX -> 14;
                case X -> 10;
                case J -> 20;
                case Q -> 3;
                case K -> 4;
                case A -> 11;
            };
        } else {
            return switch(this) {
                case VII, VIII, IX -> 0;
                case X -> 10;
                case J -> 2;
                case Q -> 3;
                case K -> 4;
                case A -> 11;
            };
        }
    }

    public int power(boolean isTrumpSuit) {
        if(isTrumpSuit) {
            return switch(this) {
                case VII -> 8;
                case VIII -> 9;
                case IX -> 14;
                case X -> 12;
                case J -> 15;
                case Q -> 10;
                case K -> 11;
                case A -> 13;
            };
        } else {
            return switch(this) {
                case VII -> 0;
                case VIII -> 1;
                case IX -> 2;
                case X -> 6;
                case J -> 3;
                case Q -> 4;
                case K -> 5;
                case A -> 7;
            };
        }
    }

    public String toString() {
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

    public int getCarreeDeclarationPower() {
        return switch(this) {
            case IX -> 4;
            case X -> 0;
            case J -> 5;
            case Q -> 1;
            case K -> 2;
            case A -> 3;
            default -> -1;
        };
    }

    public int getStraightDeclarationPower() {
        return switch(this) {
            case IX -> 0;
            case X -> 1;
            case J -> 2;
            case Q -> 3;
            case K -> 4;
            case A -> 5;
            default -> -1;
        };
    }
}
