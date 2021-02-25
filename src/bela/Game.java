package bela;

import java.util.Random;

public class Game {
    private PlayerQuartet players;
    private Match match;
    private Deck deck;
    private int USPoints = 0;
    private int YOUPoints = 0;
    private int dealer;
    private Random random = new Random();

    private int randomizeDealer() {
        return random.nextInt(NUMBER_OF_PLAYERS);
    }

    private void incrementDealer() {
        dealer = (dealer + 1) % NUMBER_OF_PLAYERS;
    }

    public static final int POINT_GOAL = 1001;
    public static final int NUMBER_OF_PLAYERS = PlayerQuartet.NUMBER_OF_PLAYERS;
    public static final int NUMBER_OF_TEAMS = 2;

    public Game(PlayerQuartet players) {
        this.players = players;
    }

    public boolean start() {
        dealer = randomizeDealer();
        while((USPoints < POINT_GOAL && YOUPoints < POINT_GOAL) || USPoints == YOUPoints) {
            match = new Match(players);
            match.start(dealer);
            incrementDealer();
            USPoints += match.getUSPoints();
            YOUPoints += match.getYOUPoints();
        }

        return USPoints > YOUPoints;
    }

    public int getUSPoints() {
        return USPoints;
    }

    public int getYOUPoints() {
        return YOUPoints;
    }
}
