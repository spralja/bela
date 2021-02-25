package bela;

import java.util.ArrayList;

public abstract class CardCollection {
    private ArrayList< Card > cards = new ArrayList<>();


    public boolean add(Card card) {
        return cards.add(card);
    }

    public Card remove(Card card) {
        for(int i = 0; i < cards.size(); ++i) {
            if(cards.get(i).equals(card)) {
                return cards.remove(i);
            }
        }

        return null;
    }

    public int size() {
        return cards.size();
    }

    public Card get(int index) {
        return cards.get(index);
    }

    public String toString(Suit trumpSuit) {
        StringBuilder string = new StringBuilder("[ ");
        for(Card card : cards) {
            string.append(card.toString(trumpSuit)).append(" ");
        }

        string.append("]");
        return string.toString();
    }
}
