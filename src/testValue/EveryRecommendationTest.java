package testValue;

import Value.EveryRecommendation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EveryRecommendationTest {
    private EveryRecommendation everyRecommendation;

    @BeforeEach
    void setUp() {
        everyRecommendation = new EveryRecommendation(3, 5);
    }

    @Test
    void testProfessorLevel() {
        // Arrange
        int expectedProfessorLevel = 3;

        // Assert
        assertEquals(expectedProfessorLevel, everyRecommendation.getProfessorLevel());
    }

    @Test
    void testQuality() {
        // Arrange
        int expectedQuality = 5;

        // Assert
        assertEquals(expectedQuality, everyRecommendation.getQuality());
    }
}