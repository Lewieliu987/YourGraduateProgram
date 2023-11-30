package testAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Algorithm.Predictor;
import Other.WeightedGPA;
import Other.WeightedOthers;

import static org.junit.jupiter.api.Assertions.*;

class PredictorTest {
    private Predictor predictor;

    @BeforeEach
    void setUp() {
        predictor = new Predictor();
    }

    @Test
    void testReadAndWeightedGPAAndOthers() {
        int tier = 3;
        double cgpa = 3.6;
        double mgpa = 3.9;
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;
        
        predictor.read(tier, cgpa, mgpa, num1, num2, num3);

        WeightedGPA expectedWGPA = new WeightedGPA(cgpa, mgpa);
        WeightedOthers expectedWOthers = new WeightedOthers(num1, num2, num3);

        assertEquals(expectedWGPA.getWeighted(), predictor.getWGPA().getWeighted());
        assertEquals(expectedWOthers.getWeighted(), predictor.getWothers().getWeighted());
    }

    @Test
    void testUpdateProb() {
        int tier = 3;
        double cgpa = 3.6;
        double mgpa = 3.9;
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;

        predictor.read(tier, cgpa, mgpa, num1, num2, num3);
        predictor.update_prob();

        assertEquals(predictor.getPosterior()[0], 0);
        assertEquals(predictor.getPosterior()[1], 0);
        assertEquals(predictor.getPosterior()[2], 0);
        assertEquals(predictor.getPosterior()[3], 0);
        assertEquals(predictor.getPosterior()[4], 0);
    }

    @Test
    void testGetMaxProb() {
        int tier = 3;
        double cgpa = 3.6;
        double mgpa = 3.9;
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;

        int expectedMaxProbIndex = 1; 
        assertEquals(expectedMaxProbIndex, predictor.getMaxProb(tier, cgpa, mgpa, num1, num2, num3));
    }
}