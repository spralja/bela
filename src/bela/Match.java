package bela;

public class Match {
    private static final int NUMBER_OF_CARS_TO_DEAL_IN_FIRST_PHASE = 6;

    private Deck deck = new Deck();
    private Suit trumpSuit;

    private void deal(int amount, Player currentPlayer) {
        int index = Game.NUMBER_OF_PLAYERS;
        while(index-- > 0) {
            for(int i = 0; i < amount; ++i) {
                currentPlayer.draw(deck.deal());
            }

            currentPlayer = currentPlayer.getNextPlayer();
        }
    }

    public Match(Player currentPlayer) {
        deck.shuffle();
        deal(NUMBER_OF_CARS_TO_DEAL_IN_FIRST_PHASE, currentPlayer);
        declareTrumpSuit(currentPlayer);
        makeDeclarations(currentPlayer);
    }

    private void declareTrumpSuit(Player currentPlayer) {
        int index = Game.NUMBER_OF_PLAYERS;
        while(index-- > 0 || trumpSuit != null) {
            trumpSuit = currentPlayer.declareTrumpSuit(index == 0);
            currentPlayer = currentPlayer.getNextPlayer();
        }
    }

    private void makeDeclarations(Player currentPlayer) {
        int index = Game.NUMBER_OF_PLAYERS;
        int maxValue = -1;
        Player winner = null;
        Declaration[][] declarations1 = {null, null, null, null};

        while(index-- > 0) {
            declarations1[index] = currentPlayer.declareDeclarations(false);
            if(declarations1[index] != null && declarations1[index][0].getValue() > maxValue) {
                maxValue = declarations1[index][0].getValue();
                winner = currentPlayer;
            }

            currentPlayer = currentPlayer.getNextPlayer();
        }

        index = Game.NUMBER_OF_PLAYERS;
        Declaration[][] declarations2 = {null, null, null, null};
        /*
        while(index-- > 0) {
            declarations2[index] = currentPlayer.declareDeclarations(false);
            if(declarations2[index] != null && declarations2[index][0].getValue() > maxValue) {
                maxValue = declarations1[index][0].getValue();
                winner = currentPlayer;
            }
        }*/
    }
}
