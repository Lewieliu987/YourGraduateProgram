package testValue;

import Value.EveryRecommendation;
import Value.Recommendation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RecommendationTest {
 
    @Test
    void testAddRecommendation() {
        int expectedProfessorLevel = 5;
        int expectedQuality = 90;
        EveryRecommendation everyRecommendation = new EveryRecommendation(expectedProfessorLevel, expectedQuality);
        ArrayList<EveryRecommendation> recommendations = new ArrayList<>();
        recommendations.add(everyRecommendation);
        Recommendation recommendation = new Recommendation(recommendations);

        // Assert
        assertEquals(expectedProfessorLevel, recommendation.getRecommendations().get(0).getProfessorLevel());
        assertEquals(expectedQuality, recommendation.getRecommendations().get(0).getQuality());
    }
}