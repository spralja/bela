package bela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void testToString00() {
        assertTrue(Suit.HEARTS.toString(Suit.SPADES).equals("♡"));
    }

    @Test
    void toString01() {
        assertTrue(Suit.HEARTS.toString(Suit.CLUBS).equals("♡"));
    }

    @Test
    void toString02() {
        assertTrue(Suit.HEARTS.toString(Suit.HEARTS).equals("♥"));
    }
}