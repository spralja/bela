package bela;

public class Match {
    private static final int NUMBER_OF_PLAYERS = PlayerQuartet.NUMBER_OF_PLAYERS;
    private int USPoints = 0;
    private int YOUPoints = 0;
    private int USDeclarations = 0;
    private int YOUDeclarations = 0;
    private int trumpSuitDeclarator;
    private Round round;
    private int dealer;
    private Suit trumpSuit;
    private PlayerQuartet players;
    private Deck deck = new Deck();
    private int currentPlayer;
    public static final int NUMBER_OF_ROUNDS = 8;
    public static final int NUMBER_OF_TEAMS = Game.NUMBER_OF_TEAMS;
    private static final int DEAL_IN_FIRST_PHASE = 6;
    private static final int DEAL_IN_SECOND_PHASE = 2;
    private static final int LAST_PILE_BONUS = 10;
    private static final int LAST_ROUND = NUMBER_OF_ROUNDS - 1;

    private boolean isUS(int playerIndex) {
        if(playerIndex % NUMBER_OF_TEAMS == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void incrementCurrentPlayer() {
        currentPlayer = (currentPlayer + 1) % NUMBER_OF_PLAYERS;
    }

    public Match(PlayerQuartet players) {
        this.players = players;
    }

    private void deal(int amount) {
        for(int i = 0; i < players.size(); ++i) {
            for(int j = 0; j < amount; ++j) {
                players.get(j).draw(deck.deal());
            }
        }
    }

    public void start(int dealer) {
        deck.shuffle();
        deal(DEAL_IN_FIRST_PHASE);
        players.closeTalon();

        declareTrumpSuit(dealer);
        deal(DEAL_IN_SECOND_PHASE);
        players.openTalon();
        declareDeclarations(dealer);

        for(int i = 0; i < NUMBER_OF_ROUNDS; ++i) {
            round = new Round(players, trumpSuit);
            round.start(dealer);
            USPoints += round.getUSPoints();
            YOUPoints += round.getYOUPoints();
            dealer = round.getNextStartingPlayer();
            if(i == LAST_ROUND) {
                if(isUS(round.getWinner())) {
                    USPoints += LAST_PILE_BONUS;
                } else {
                    YOUPoints += LAST_PILE_BONUS;
                }
            }
        }

        if(isUS(trumpSuitDeclarator)) {
            if(USPoints > YOUPoints) {
                USPoints += USDeclarations;
                YOUPoints += YOUDeclarations;
            } else {
                YOUPoints += USPoints + YOUDeclarations + USDeclarations;
                USPoints = 0;
                USDeclarations = 0;
            }
        } else {
            if(YOUPoints > USPoints) {
                YOUPoints += YOUDeclarations;
                USPoints += USDeclarations;
            } else {
                USPoints += YOUPoints + USDeclarations + YOUDeclarations;
                YOUPoints = 0;
                YOUDeclarations = 0;
            }
        }
    }

    private void declareDeclarations(int dealer) {
        int currentPlayer = dealer;

    }

    private void declareTrumpSuit(int dealer) {
        //DUmmy
        trumpSuit = Suit.SPADES;
    }

    public int getUSPoints() {
        return USPoints;
    }

    public int getYOUPoints() {
        return YOUPoints;
    }
}
