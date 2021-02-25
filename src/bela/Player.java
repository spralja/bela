package bela;

public abstract class Player {
    private Hand hand;
    private String name;
    private Player nextPlayer;
    private boolean isUS;

    public Player(String name, boolean isUS) {
        this.name = name;
        this.isUS = isUS;
    }

    public Player() {}

    public String getName() {
        return name;
    }

    public void setNextPlayer(Player player) {
        this.nextPlayer = player;
    }

    public abstract Card play();

    public abstract Declaration declareDeclarations();

    public abstract Suit declareTrumpSuit();

    public void draw(Card card) {
        hand.add(card);
    }

    public String toString(Suit trumpSuit) {
        StringBuilder string = new StringBuilder(name);
        string.append(": ");
        string.append(hand);
        return string.toString();
    }

    public abstract void openTalon();

    public abstract void closeTalon();

    //public abstract void addToGame(Game game);
}
