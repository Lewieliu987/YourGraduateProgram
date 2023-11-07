package testAlgorithm;

import Algorithm.Predictor;
import Algorithm.Parameter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NaiveBayesTest {

    @Test
    public void testPredictor() {
        Predictor predictor = new Predictor();

        ArrayList<Parameter> parameters = predictor.getps();

        // Check that 5 Parameter objects were created
        assertEquals(5, parameters.size());

        // Check that the first Parameter object has tier 1
        assertEquals(1, parameters.get(0).getTier());

        // Check that the last Parameter object has tier 5
        assertEquals(5, parameters.get(4).getTier());
    }
}