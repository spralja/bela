package bela;

public class PlayerQuartet extends PlayerCollection {
    public static final int NUMBER_OF_PLAYERS = 4;
    @Override
    public boolean add(Player player) {
        if(size() < NUMBER_OF_PLAYERS) {
            return players.add(player);
        } else {
            return false;
        }
    }

    @Override
    public void openTalon() {
        for(Player player : players) {
            player.openTalon();
        }
    }

    @Override
    public void closeTalon() {
        for(Player player : players) {
            player.closeTalon();
        }
    }
}
