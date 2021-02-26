package bela;

public abstract class BelaMatchUnit {
    protected Player currentPlayer;
    protected Player nextPlayer(Player currentPlayer) {
        currentPlayer = currentPlayer.getNextPlayer();
        return currentPlayer;
    }


}
