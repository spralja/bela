package bela;

public abstract class Player {
    private Hand hand;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Player() {
        this("");
    }

    public String getName() {
        return name;
    }

    public abstract Card play(Game game);

    public abstract Declaration declareDeclarations(Game game);

    public abstract Suit declareTrumpSuit(Game game);

    public abstract Player draw(Card card);

    public abstract Card play();

    public String toString(Suit trumpSuit) {
        StringBuilder string = new StringBuilder(name);
        string.append(": ");
        string.append(hand);
        return string.toString();
    }

    public abstract void openTalon();

    public abstract void closeTalon();
}
