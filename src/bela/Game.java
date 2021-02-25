package bela;

public class Game {
    private static final int NUMBER_OF_TEAMS = Team.NUMBER_OF_TEAMS;
    private static final int NUMBER_OF_PLAYERS = 4;

    Player currentPlayer = null;
    private int size = 0;



    private Team getTeam() {
        if(size % NUMBER_OF_TEAMS == 0) {
            return Team.US;
        } else {
            return  Team.YOU;
        }
    }

    public Game addPlayer(Player player) throws TeamOverflowException {
        if(size == NUMBER_OF_PLAYERS) {
            throw new TeamOverflowException("");
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
}
