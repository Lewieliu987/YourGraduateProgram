package testOther;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Other.ComputeSD;

public class ComputeSDTest {
    @Test
    public void testGetMean() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        ComputeSD computeSD = new ComputeSD(numbers);

        double actualMean = computeSD.getMean();
        double expectedMean = 3.0;

        assertEquals(expectedMean, actualMean, 0.0001, "The mean of 1.0, 2.0, 3.0, 4.0, 5.0 should be 3.0");
    }

    @Test
    public void testGetSD() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        ComputeSD computeSD = new ComputeSD(numbers);

        double actualSD = computeSD.getSD();
        double expectedSD = 1.5811;  // pre-calculated standard deviation

        assertEquals(expectedSD, actualSD, 0.0001, "The standard deviation of 1.0, 2.0, 3.0, 4.0, 5.0 should be close to 1.5811");
    }
}
