package bela;

public abstract class Player {
    private Hand hand;
    private String name;
    private Player nextPlayer;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public Player() {}

    public String getName() {
        return name;
    }

    public void setNextPlayer(Player player) {
        this.nextPlayer = player;
    }

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public abstract Card play();

    public abstract Declaration[] declareDeclarations(boolean isFinal);

    public abstract Suit declareTrumpSuit(boolean must);

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

    public void setTeam(Team team) {
        this.team = team;
    }

    //public abstract void addToGame(Game game);
}
