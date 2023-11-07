package testValue;

import Value.LanguageScore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageScoreTest {
    private LanguageScore languageScore;

    @BeforeEach
    void setUp() {
        languageScore = new LanguageScore(7.5, 105, 320);
    }

    @Test
    void testIelts() {
        // Arrange
        double expectedIelts = 7.5;

        // Assert
        assertEquals(expectedIelts, languageScore.getIelts(), 0.001);
    }

    @Test
    void testTofel() {
        // Arrange
        double expectedTofel = 105;

        // Assert
        assertEquals(expectedTofel, languageScore.getTofel(), 0.001);
    }

    @Test
    void testGre() {
        // Arrange
        double expectedGre = 320;

        // Assert
        assertEquals(expectedGre, languageScore.getGre(), 0.001);
    }
}