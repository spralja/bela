package bela;

import org.junit.jupiter.api.Test;

import java.time.chrono.HijrahDate;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    @Test
    void toString00() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        assertTrue(hand.toString(Suit.CLUBS).equals("[ K♡ K♤ K♡ K♤ K♡ K♤ ** ** ]"));
    }

    @Test
    void toString01() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        assertTrue(hand.toString(Suit.DIAMONDS).equals("[ K♡ K♤ K♡ K♤ K♡ K♤ ** ** ]"));
    }

    @Test
    void toString02() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        assertTrue(hand.toString(Suit.HEARTS).equals("[ K♥ K♤ K♥ K♤ K♥ K♤ ** ** ]"));
    }

    @Test
    void toString03() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        assertTrue(hand.toString(Suit.SPADES).equals("[ K♡ K♠ K♡ K♠ K♡ K♠ ** ** ]"));
    }

    @Test
    void toString04() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.openTalon();
        assertTrue(hand.toString(Suit.CLUBS).equals("[ K♡ K♤ K♡ K♤ K♡ K♤ ]"));
    }

    @Test
    void toString05() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.openTalon();
        assertTrue(hand.toString(Suit.DIAMONDS).equals("[ K♡ K♤ K♡ K♤ K♡ K♤ ]"));
    }

    @Test
    void toString06() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.openTalon();
        assertTrue(hand.toString(Suit.HEARTS).equals("[ K♥ K♤ K♥ K♤ K♥ K♤ ]"));
    }

    @Test
    void toString07() {
        Hand hand = new Hand();
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.add(new Card(Suit.HEARTS, Rank.K));
        hand.add(new Card(Suit.SPADES, Rank.K));
        hand.openTalon();
        assertTrue(hand.toString(Suit.SPADES).equals("[ K♡ K♠ K♡ K♠ K♡ K♠ ]"));
    }
}