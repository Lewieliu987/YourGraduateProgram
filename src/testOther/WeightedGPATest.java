package testOther;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Other.WeightedGPA;

public class WeightedGPATest {

    @Test
    public void testGetCGPA() {
        double CGPA = 3.5;
        WeightedGPA weightedGPA = new WeightedGPA(CGPA, 0);
        assertEquals(CGPA, weightedGPA.getCGPA(), 0.001, "The CGPA should match the input");
    }

    @Test
    public void testGetMGPA() {
        double MGPA = 4.0;
        WeightedGPA weightedGPA = new WeightedGPA(0, MGPA);
        assertEquals(MGPA, weightedGPA.getMGPA(), 0.001, "The MGPA should match the input");
    }

    @Test
    public void testGetWeighted() {
        double CGPA = 3.5;
        double MGPA = 4.0;
        WeightedGPA weightedGPA = new WeightedGPA(CGPA, MGPA);
        assertEquals((CGPA * 0.5 + MGPA * 0.5), weightedGPA.getWeighted(), 0.001, "The weighted GPA should be correctly calculated");
    }
}