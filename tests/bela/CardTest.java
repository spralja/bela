package bela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CardTest {

    @Test
    void value00() {
        Card card1 = new Card(Suit.HEARTS, Rank.J);
        assertTrue(card1.value(Suit.SPADES) == 2);
    }

    @Test
    void value01() {
        Card card1 = new Card(Suit.HEARTS, Rank.J);
        assertTrue(card1.value(Suit.HEARTS) == 20);
    }

    @Test
    void value02() {
        Card card1 = new Card(Suit.HEARTS, Rank.IX);
        assertTrue(card1.value(Suit.SPADES) == 0);
    }

    @Test
    void value03() {
        Card card1 = new Card(Suit.HEARTS, Rank.IX);
        assertTrue(card1.value(Suit.HEARTS) == 14);
    }


    @Test
    void beats00() {
        Card card1 = new Card(Suit.HEARTS, Rank.X);
        Card card2 = new Card(Suit.HEARTS, Rank.IX);
        assertTrue(card1.beats(card2, Suit.SPADES));
    }

    @Test
    void beats01() {
        Card card1 = new Card(Suit.HEARTS, Rank.X);
        Card card2 = new Card(Suit.HEARTS, Rank.IX);
        assertFalse(card1.beats(card2, Suit.HEARTS));
    }

    @Test
    void beats02() {
        Card card1 = new Card(Suit.HEARTS, Rank.IX);
        Card card2 = new Card(Suit.SPADES, Rank.VIII);
        assertFalse(card1.beats(card2, Suit.CLUBS));
    }

    @Test
    void beats03() {
        Card card1 = new Card(Suit.SPADES, Rank.VII);
        Card card2 = new Card(Suit.HEARTS, Rank.VIII);
        assertTrue(card1.beats(card2, Suit.SPADES));
    }
}