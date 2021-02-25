package bela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {

    @Test
    void value00() {
        assertTrue(Rank.Q.value(false) == 3);
    }

    @Test
    void value01() {
        assertTrue(Rank.Q.value(true) == 3);
    }

    @Test
    void value02() {
        assertTrue(Rank.IX.value(false) == 0);
    }

    @Test
    void value03() {
        assertTrue(Rank.IX.value(true) == 14);
    }


    @Test
    void power00() {
        assertTrue(Rank.IX.power(false) == 2);
    }

    @Test
    void power01() {
        assertTrue(Rank.IX.power(true) == 14);
    }

    @Test
    void power02() {
        assertTrue(Rank.X.power(false) == 6);
    }

    @Test
    void power03() {
        assertTrue(Rank.X.power(true) == 12);
    }

    @Test
    void toString00() {
        assertTrue(Rank.IX.toString().equals("IX"));
    }

    @Test
    void toString01() {
        assertTrue(Rank.X.toString().equals("X"));
    }


}