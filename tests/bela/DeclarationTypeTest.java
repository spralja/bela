package bela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeclarationTypeTest {
    @Test
    void power00() {
        assertTrue(DeclarationType.TIERCE.getPower() < DeclarationType.QUINTE.getPower());
    }

    @Test
    void power01() {
        assertTrue(DeclarationType.TIERCE.getPower() < DeclarationType.CARREE.getPower());
    }

    @Test
    void power02() {
        assertTrue(DeclarationType.QUINTE.getPower() < DeclarationType.CARREE.getPower());
    }
}