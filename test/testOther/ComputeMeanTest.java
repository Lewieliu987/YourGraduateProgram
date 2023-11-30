package testOther;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Other.ComputeMean;

public class ComputeMeanTest {

    @Test
    public void testGetMean() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        ComputeMean computeMean = new ComputeMean(numbers);

        double actualMean = computeMean.getMean();
        double expectedMean = 3.0;

        assertEquals(expectedMean, actualMean, "The mean of 1.0, 2.0, 3.0, 4.0, 5.0 should be 3.0");
    }
}