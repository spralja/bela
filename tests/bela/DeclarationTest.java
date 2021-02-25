package bela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeclarationTest {
    @Test
    void beats00() {
        Declaration d1 = new Declaration(DeclarationType.TIERCE, new Card(Suit.SPADES, Rank.K));
        Declaration d2 = new Declaration(DeclarationType.TIERCE, new Card(Suit.SPADES, Rank.X));
        assertTrue(d1.compare(d2, Suit.SPADES) > 0);
    }

    @Test
    void beats01() {
        Declaration d1 = new Declaration(DeclarationType.TIERCE, new Card(Suit.SPADES, Rank.K));
        Declaration d2 = new Declaration(DeclarationType.TIERCE, new Card(Suit.SPADES, Rank.X));
        assertTrue(d1.compare(d2, Suit.HEARTS) > 0);
    }

    @Test
    void beats02() {
        Declaration d1 = new Declaration(DeclarationType.TIERCE, new Card(Suit.HEARTS, Rank.K));
        Declaration d2 = new Declaration(DeclarationType.TIERCE, new Card(Suit.HEARTS, Rank.X));
        assertTrue(d1.compare(d2, Suit.SPADES) > 0);
    }

    @Test
    void beats03() {
        Declaration d1 = new Declaration(DeclarationType.TIERCE, new Card(Suit.HEARTS, Rank.K));
        Declaration d2 = new Declaration(DeclarationType.TIERCE, new Card(Suit.HEARTS, Rank.X));
        assertTrue(d1.compare(d2, Suit.HEARTS) > 0);
    }

    @Test
    void beats04() {
        Declaration d1 = new Declaration(DeclarationType.CARREE, new Card(Suit.HEARTS, Rank.A));
        Declaration d2 = new Declaration(DeclarationType.CARREE, new Card(Suit.HEARTS, Rank.J));
        assertTrue(d1.compare(d2, Suit.HEARTS) < 0);
    }

    @Test
    void beats05() {
        Declaration d1 = new Declaration(DeclarationType.CARREE, new Card(Suit.HEARTS, Rank.J));
        Declaration d2 = new Declaration(DeclarationType.CARREE, new Card(Suit.HEARTS, Rank.A));
        assertTrue(d1.compare(d2, Suit.HEARTS) > 0);
    }

}