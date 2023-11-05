package testValue;

import Value.EveryRecommendation;
import Value.Recommendation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecommendationTest {
    private Recommendation recommendation;
    private EveryRecommendation everyRecommendation;

    @BeforeEach
    void setUp() {
        everyRecommendation = new EveryRecommendation(/* parameters as needed */);
        ArrayList<EveryRecommendation> recommendations = new ArrayList<>();
        recommendations.add(everyRecommendation);
        recommendation = new Recommendation(recommendations);
    }

    @Test
    void testAddRecommendation() {
        // Arrange
        EveryRecommendation newRecommendation = new EveryRecommendation(/* parameters as needed */);

        // Act
        recommendation.addRecommendation(newRecommendation);

        // Assert
        assertEquals(newRecommendation, recommendation.getRecommendations().get(1));
    }
}