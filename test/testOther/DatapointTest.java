package testOther;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Other.Datapoint;

public class DatapointTest {

    @Test
    public void testDatapoint() {
        int tier1 = 1;
        int tier2 = 2;
        double gpa1 = 3.5;
        double gpa2 = 3.7;
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;

        Datapoint datapoint = new Datapoint(tier1, tier2, gpa1, gpa2, num1, num2, num3);

        assertEquals(tier1, datapoint.getTierAdmission(), "The tier of admission university should match the input");
        assertEquals(tier2, datapoint.getTierBackground(), "The tier of background university should match the input");
        assertEquals(gpa1, datapoint.getCGPA(), "The CGPA should match the input");
        assertEquals(gpa2, datapoint.getMGPA(), "The MGPA should match the input");
        assertEquals(num1, datapoint.getNumLor(), "The number of LoR should match the input");
        assertEquals(num2, datapoint.getNumIntern(), "The number of internships should match the input");
        assertEquals(num3, datapoint.getNumPaper(), "The number of papers should match the input");
    }
}