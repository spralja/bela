package bela;

public class Round {

    private int USPoints = 0;
    private int YOUPoints = 0;
    private Pile pile;
    private Suit trumpSuit;
    private PlayerQuartet players;
    private int currentPlayer;
    private int nextStartingPlayer;

    private static final int NUMBER_OF_PLAYERS = PlayerQuartet.NUMBER_OF_PLAYERS;
    private static final int NUMBER_OF_TEAMS = Game.NUMBER_OF_TEAMS;

    private void incrementCurrentPlayer() {
        currentPlayer = (currentPlayer + 1) / NUMBER_OF_PLAYERS;
    }

    private boolean isUS(int playerIndex) {
        if(playerIndex % NUMBER_OF_TEAMS == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Round(PlayerQuartet players, Suit trumpSuit) {
        this.players = players;
        this.trumpSuit = trumpSuit;
    }

    public void start(int startingPlayer) {
        this.pile = new Pile(startingPlayer, trumpSuit);
        currentPlayer = startingPlayer;

        for(int i = 0; i < NUMBER_OF_PLAYERS; ++i) {
            pile.play(players.get(i).play());
        }

        if (isUS(pile.getWinner())) {
            USPoints += pile.getValue();
        } else {
            YOUPoints += pile.getValue();
        }

        nextStartingPlayer = pile.getWinner();
    }

    public int getNextStartingPlayer() {
        return nextStartingPlayer;
    }

    public int getWinner() {
        return pile.getWinner();
    }

    public int getUSPoints() {
        return USPoints;
    }

    public int getYOUPoints() {
        return YOUPoints;
    }
}
