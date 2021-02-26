package bela;

import org.junit.jupiter.api.Test;

import java.security.cert.PolicyQualifierInfo;

import static org.junit.jupiter.api.Assertions.*;

class DeclarationTest {
    private static final DeclarationType TIERCE = DeclarationType.TIERCE;
    private static final DeclarationType QUARTE = DeclarationType.QUARTE;
    private static final DeclarationType QUINTE = DeclarationType.QUINTE;
    private static final DeclarationType CARREE = DeclarationType.CARREE;

    private static final Suit HEARTS = Suit.HEARTS;
    private static final Suit SPADES = Suit.SPADES;
    private static final Suit DIAMONDS = Suit.DIAMONDS;
    private static final Suit CLUBS = Suit.CLUBS;

    private static final Rank VII = Rank.VII;
    private static final Rank VIII = Rank.VIII;
    private static final Rank IX = Rank.IX;
    private static final Rank X = Rank.X;
    private static final Rank J = Rank.J;
    private static final Rank Q = Rank.Q;
    private static final Rank K = Rank.K;
    private static final Rank A = Rank.A;

    private int compareTest(DeclarationType dt1, Suit suit1, Rank rank1, DeclarationType dt2, Suit suit2,
                                Rank rank2, Suit trumpSuit) {
        Declaration d1 = new Declaration(dt1, new Card(suit1, rank1));
        Declaration d2 = new Declaration(dt2, new Card(suit2, rank2));
        return d1.compare(d2, trumpSuit);
    }

    @Test
    void compare00() {
        assertTrue(compareTest(TIERCE, HEARTS, J, TIERCE, DIAMONDS, X, CLUBS) > 0);
    }

    @Test
    void compare01() {
        assertTrue(compareTest(QUARTE, DIAMONDS, Q, QUARTE, CLUBS, J, HEARTS) > 0);
    }

    @Test
    void compare02() {
        assertTrue(compareTest(TIERCE, CLUBS, Q, TIERCE, DIAMONDS, Q, HEARTS) == 0);
    }

    @Test
    void compare03() {
        assertTrue(compareTest(QUARTE, DIAMONDS, K, QUARTE, HEARTS, K, CLUBS) == 0);
    }

    @Test
    void compare04() {
        assertTrue(compareTest(TIERCE, CLUBS, IX, TIERCE, HEARTS, X, DIAMONDS) < 0);
    }

    @Test
    void compare05() {
        assertTrue(compareTest(TIERCE, DIAMONDS, X, TIERCE, CLUBS, J, HEARTS) < 0);
    }

    @Test
    void compare06() {
        assertTrue(compareTest(QUARTE, HEARTS, X, QUARTE, DIAMONDS, J, HEARTS) > 0);
    }

    @Test
    void compare07() {
        assertTrue(compareTest(QUINTE, DIAMONDS, J, QUINTE, CLUBS, Q, DIAMONDS) > 0);
    }

    @Test
    void compare08() {
        assertTrue(compareTest(TIERCE, DIAMONDS, A, TIERCE, CLUBS, X, CLUBS) < 0);
    }

    @Test
    void compare09() {
        assertTrue(compareTest(QUINTE, HEARTS, Q, QUINTE, DIAMONDS, J, DIAMONDS) < 0);
    }

    @Test
    void compare10() {
        assertTrue(compareTest(TIERCE, HEARTS, A, QUARTE, DIAMONDS, X, HEARTS) < 0);
    }

    @Test
    void compare11() {
        assertTrue(compareTest(QUINTE, CLUBS, K, TIERCE, SPADES, A, SPADES) > 0);
    }

    @Test
    void compare12() {
        assertTrue(compareTest(CARREE, CLUBS, Q, QUINTE, SPADES, X, SPADES) > 0);
    }

    @Test
    void compare13() {
        assertTrue(compareTest(CARREE, CLUBS, IX, CARREE, HEARTS, A, DIAMONDS) > 0);
    }

    @Test
    void compare14() {
        assertTrue(compareTest(CARREE, CLUBS, J, CARREE, DIAMONDS, IX, DIAMONDS) > 0);
    }

}