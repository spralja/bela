package bela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardCollectionTest {

    @Test
    void add00() {
        CardCollection cards = new CardCollectionDummy();
        cards.add(new Card(Suit.HEARTS, Rank.K));
        assertTrue(cards.size() == 1);
    }

    @Test
    void remove00() {
        CardCollection cards = new CardCollectionDummy();
        Card card1 = new Card(Suit.HEARTS, Rank.K);
        Card card2 = new Card(Suit.HEARTS, Rank.K);
        cards.add(card1);
        assertTrue(cards.remove(card2).equals(card1));
    }


    @Test
    void remove01() {
        CardCollection cards = new CardCollectionDummy();
        Card card1 = new Card(Suit.HEARTS, Rank.K);
        cards.add(card1);
        assertTrue(cards.remove(card1).equals(card1));
    }

    @Test
    void size00() {
        CardCollection cards = new CardCollectionDummy();
        cards.add(new Card(Suit.HEARTS, Rank.K));
        assertTrue(cards.size() == 1);
    }

    @Test
    void get00() {
        CardCollection cards = new CardCollectionDummy();
        Card card = new Card(Suit.HEARTS, Rank.K);
        cards.add(card);
        assertTrue(cards.get(0).equals(card));
    }
}

class CardCollectionDummy extends CardCollection {
}