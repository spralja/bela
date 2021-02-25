package bela;

public enum DeclarationType {
    TIERCE,
    QUARTE,
    QUINTE,
    CARREE,
    ;
    public int getPower() {
        return switch(this) {
            case TIERCE -> 0;
            case QUARTE -> 1;
            case QUINTE -> 2;
            case CARREE -> 3;
        };
    }
}
