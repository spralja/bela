package bela;

import java.util.Random;

public class Game {
    public static final int NUMBER_OF_PLAYERS = 4;
    private static final int POINTS_GOAL = 1001;

    private Player currentPlayer = null;
    private int size = 0;
    private Random random = new Random();

    private Team getTeam() {
        if(size % Team.NUMBER_OF_TEAMS == 0) {
            return Team.US;
        } else {
            return  Team.YOU;
        }
    }

    private Player getRandomPlayer() {
        int increment = random.nextInt(NUMBER_OF_PLAYERS);
        Player randomPlayer = currentPlayer;
        while(increment-- > 0) {
            randomPlayer = randomPlayer.getNextPlayer();
        }

        return randomPlayer;
    }

    public Game addPlayer(Player player) throws PlayerOverflowException {
        if(size == NUMBER_OF_PLAYERS) {
            throw new PlayerOverflowException("A game cannot have more than 4 players!");
        }

        if(currentPlayer == null) {
            currentPlayer = player;
        } else {
            currentPlayer.setNextPlayer(player);
        }

        player.setTeam(getTeam());

        ++size;

        return this;
    }

    public Team start() throws NotEnoughPlayersException{
        if(size != NUMBER_OF_PLAYERS) {
            throw new NotEnoughPlayersException("There must be exactly 4 players to start a game!");
        }

        currentPlayer = getRandomPlayer();
        Team.resetPoints();
        while((Team.US.getPoints() < POINTS_GOAL && Team.YOU.getPoints() < POINTS_GOAL) ||
                Team.US.getPoints() == Team.YOU.getPoints()) {
            Match match = new Match(currentPlayer);
        }

        return null;
    }
}
