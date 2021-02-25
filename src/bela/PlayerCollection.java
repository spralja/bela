package bela;

import java.util.ArrayList;

public abstract class PlayerCollection {
    protected ArrayList< Player > players;

    public boolean add(Player player) {
        return players.add(player);
    }

    public Player get(int index) {
        return players.get(index);
    }

    public int size() {
        return players.size();
    }

    public String toString(Suit trumpSuit) {
        StringBuilder string = new StringBuilder("[\n");
        for(Player player : players) {
            string.append(player.toString(trumpSuit)).append(",\n");
        }

        string.append("]");
        return string.toString();
    }
}
