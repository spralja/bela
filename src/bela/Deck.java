package bela;

import java.util.Random;

public class Deck extends CardCollection{
    private static final int NUMBER_OF_SUITS = Suit.NUMBER_OF_SUITS;
    private static final int NUMBER_OF_RANKS = Rank.NUMBER_OF_RANKS;
    private static final int NUMBER_OF_CARDS_IN_FULL_DECK = NUMBER_OF_SUITS * NUMBER_OF_RANKS;
    public Random random = new Random();

    private int getRandomIndexOfCard() {
        return random.nextInt(NUMBER_OF_CARDS_IN_FULL_DECK);
    }

    private void swap(int index1, int index2) {
        cards.set(index1, cards.set(index2, cards.get(index1)));
    }
    public Deck() {
        for(int i = 0; i < NUMBER_OF_SUITS; ++i) {
            for(int j = 0; j < NUMBER_OF_RANKS; ++j) {
                cards.add(new Card(Suit.getByIndex(i), Rank.getByIndex(j)));
            }
        }
    }

    public Card deal() {
        return cards.remove(cards.size() - 1);
    }

    public void shuffle() {
        for(int i = 0; i < NUMBER_OF_CARDS_IN_FULL_DECK; ++i) {
            swap(i, getRandomIndexOfCard());
        }
    }
}
