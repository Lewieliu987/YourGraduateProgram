package testAlgorithm;
import Algorithm.Parameter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterTest {

    @Test
    void testParameter1() {
        // Test for AdmissionTier=1 (assuming it corresponds to the first line of your CSV file)
        int tier = 1;
        Parameter parameter = new Parameter(tier);

        // Expected values for tier 1
        double expectedP1 = 0.8;
        double expectedP2 = 0.2;
        double expectedP3 = 0;
        double expectedP4 = 0;
        double expectedP5 = 0;
        double expectedMeanGPA = 3.9/4;
        double expectedSdGPA = 0.06;
        double expectedMeanOthers = 3;
        double expectedSdOthers = 0.5;


        assertEquals(expectedP1, parameter.getP1());
        assertEquals(expectedP2, parameter.getP2());
        assertEquals(expectedP3, parameter.getP3());
        assertEquals(expectedP4, parameter.getP4());
        assertEquals(expectedP5, parameter.getP5());
        assertEquals(expectedMeanGPA, parameter.getmeanGPA());
        assertEquals(expectedSdGPA, parameter.getsdGPA());
        assertEquals(expectedMeanOthers, parameter.getmeanOthers());
        assertEquals(expectedSdOthers, parameter.getsdOthers());
        

    }
    void testParameter2() {
        
        int tier = 2;
        Parameter parameter = new Parameter(tier);
        // Expected values for tier 2
        double expectedP1 = 0.1;
        double expectedP2 = 0.8;
        double expectedP3 = 0.1;
        double expectedP4 = 0;
        double expectedP5 = 0;
        double expectedMeanGPA = 3.77/4;
        double expectedSdGPA = 0.06;
        double expectedMeanOthers = 3;
        double expectedSdOthers = 0.5;   
        
        // Assertions
        assertEquals(expectedP1, parameter.getP1());
        assertEquals(expectedP2, parameter.getP2());
        assertEquals(expectedP3, parameter.getP3());
        assertEquals(expectedP4, parameter.getP4());
        assertEquals(expectedP5, parameter.getP5());
        assertEquals(expectedMeanGPA, parameter.getmeanGPA());
        assertEquals(expectedSdGPA, parameter.getsdGPA());
        assertEquals(expectedMeanOthers, parameter.getmeanOthers());
        assertEquals(expectedSdOthers, parameter.getsdOthers());
    }
    void testParameter3() {
    	 // Test for AdmissionTier=1 (assuming it corresponds to the first line of your CSV file)
        int tier = 3;
        Parameter parameter = new Parameter(tier);

     // Expected values for tier 3
        double expectedP1 = 0;
        double expectedP2 = 0.1;
        double expectedP3 = 0.8;
        double expectedP4 = 0.1;
        double expectedP5 = 0;
        double expectedMeanGPA = 3.6/4;
        double expectedSdGPA = 0.06;
        double expectedMeanOthers = 3;
        double expectedSdOthers = 0.5;

        // Assertions
        assertEquals(expectedP1, parameter.getP1());
        assertEquals(expectedP2, parameter.getP2());
        assertEquals(expectedP3, parameter.getP3());
        assertEquals(expectedP4, parameter.getP4());
        assertEquals(expectedP5, parameter.getP5());
        assertEquals(expectedMeanGPA, parameter.getmeanGPA());
        assertEquals(expectedSdGPA, parameter.getsdGPA());
        assertEquals(expectedMeanOthers, parameter.getmeanOthers());
        assertEquals(expectedSdOthers, parameter.getsdOthers());
    }
    void testParameter4() {
    	 // Test for AdmissionTier=1 (assuming it corresponds to the first line of your CSV file)
        int tier = 4;
        Parameter parameter = new Parameter(tier);

     // Expected values for tier 4
        double expectedP1 = 0;
        double expectedP2 = 0;
        double expectedP3 = 0.1;
        double expectedP4 = 0.8;
        double expectedP5 = 0.1;
        double expectedMeanGPA = 3.3/4;
        double expectedSdGPA = 0.06;
        double expectedMeanOthers = 3;
        double expectedSdOthers = 0.5;
        // Assertions
        assertEquals(expectedP1, parameter.getP1());
        assertEquals(expectedP2, parameter.getP2());
        assertEquals(expectedP3, parameter.getP3());
        assertEquals(expectedP4, parameter.getP4());
        assertEquals(expectedP5, parameter.getP5());
        assertEquals(expectedMeanGPA, parameter.getmeanGPA());
        assertEquals(expectedSdGPA, parameter.getsdGPA());
        assertEquals(expectedMeanOthers, parameter.getmeanOthers());
        assertEquals(expectedSdOthers, parameter.getsdOthers());
    }
    void testParameter5() {
    	 // Test for AdmissionTier=1 (assuming it corresponds to the first line of your CSV file)
        int tier = 5;
        Parameter parameter = new Parameter(tier);

     // Expected values for tier 5
        double expectedP1 = 0;
        double expectedP2 = 0;
        double expectedP3 = 0;
        double expectedP4 = 0.2;
        double expectedP5 = 0.8;
        double expectedMeanGPA = 3.0/4;
        double expectedSdGPA = 0.06;
        double expectedMeanOthers = 3;
        double expectedSdOthers = 0.5;

        // Assertions
        assertEquals(expectedP1, parameter.getP1());
        assertEquals(expectedP2, parameter.getP2());
        assertEquals(expectedP3, parameter.getP3());
        assertEquals(expectedP4, parameter.getP4());
        assertEquals(expectedP5, parameter.getP5());
        assertEquals(expectedMeanGPA, parameter.getmeanGPA());
        assertEquals(expectedSdGPA, parameter.getsdGPA());
        assertEquals(expectedMeanOthers, parameter.getmeanOthers());
        assertEquals(expectedSdOthers, parameter.getsdOthers());
    }
}