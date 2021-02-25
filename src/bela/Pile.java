package bela;

public class Pile extends CardCollection {
    private static final int NUMBER_OF_PLAYERS = Game.NUMBER_OF_PLAYERS;
    private Suit trumpSuit;
    private Card topCard;
    private Suit suit;
    private int winner;
    private int currentPlayer;

    private void incrementCurrentPlayer() {
        currentPlayer = (currentPlayer + 1) % NUMBER_OF_PLAYERS;
    }

    public Pile(int startingPlayer, Suit trumpSuit) {
        this.currentPlayer = startingPlayer;
        this.trumpSuit = trumpSuit;
    }

    public void play(Card card) {
        if(cards.isEmpty()) {
            topCard = card;
            suit = card.getSuit();
            winner = currentPlayer;
        } else {
            if(card.beats(topCard, trumpSuit)) {
                topCard = card;
                winner = currentPlayer;
            }
        }

        cards.add(card);
        incrementCurrentPlayer();
    }


    public int getWinner() {
        return winner;
    }

    public int getValue() {
        int value = 0;
        for(Card card : cards) {
            value += card.value(trumpSuit);
        }

        return value;
    }
}
