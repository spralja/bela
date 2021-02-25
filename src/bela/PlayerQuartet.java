package bela;

public class PlayerQuartet extends PlayerCollection {
    private static final int NUMBER_OF_PLAYERS = 4;
    @Override
    public boolean add(Player player) {
        if(size() < NUMBER_OF_PLAYERS) {
            return players.add(player);
        } else {
            return false;
        }
    }
}
