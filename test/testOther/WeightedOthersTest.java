package testOther;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Other.WeightedOthers;

public class WeightedOthersTest {

    @Test
    public void testNumIntern() {
        int numIntern = 2;
        WeightedOthers weightedOthers = new WeightedOthers(0, numIntern, 0);
        assertEquals(numIntern, weightedOthers.getNumIntern(), "The number of internships should match the input");
    }

    @Test
    public void testNumLor() {
        int numLoR = 3;
        WeightedOthers weightedOthers = new WeightedOthers(numLoR, 0, 0);
        assertEquals(numLoR, weightedOthers.getNumLor(), "The number of LoR should match the input");
    }

    @Test
    public void testNumPaper() {
        int numPaper = 1;
        WeightedOthers weightedOthers = new WeightedOthers(0, 0, numPaper);
        assertEquals(numPaper, weightedOthers.getNumPaper(), "The number of papers should match the input");
    }

    @Test
    public void testWeighted() {
        int numIntern = 2;
        int numLoR = 3;
        int numPaper = 1;
        WeightedOthers weightedOthers = new WeightedOthers(numLoR, numIntern, numPaper);
        assertEquals((numIntern * 1 + numLoR * 1 + numPaper * 2), weightedOthers.getWeighted(), 0.001, "The weighted sum should be correctly calculated");
    }
}