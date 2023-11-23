package testAlgorithm;
import Algorithm.Parameter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

class ParameterTest {
	
    private Parameter parameter;
    
    @BeforeEach
    public void setup() {
        // Initialize the Parameter object. For simplicity, I use the tier 1.
        parameter = new Parameter(1);

        // Set the values manually for testing purposes
        parameter.setP1(0.1);
        parameter.setP2(0.2);
        parameter.setP3(0.3);
        parameter.setP4(0.4);
        parameter.setP5(0.5);

        parameter.setMeanGPA(3.5);
        parameter.setsdGPA(0.5);

        parameter.setMeanOthers(4.0);
        parameter.setsdOthers(0.4);
    }
	
    @Test
    void testParameter1() {
        // Test for AdmissionTier=1 (assuming it corresponds to the first line of your CSV file)
        int tier = 1;
        Parameter parameter = new Parameter(tier);

        // Expected values for tier 1
        double expectedP1 = 0.5714285714285714;
        double expectedP2 = 0.2571428571428571;
        double expectedP3 = 0.17142857142857143;
        double expectedP4 = 0;
        double expectedP5 = 0;
        double expectedMeanGPA = 0.9620714285714289;
        double expectedSdGPA = 0.03378848162737163;
        double expectedMeanOthers = 4.242857142857143;
        double expectedSdOthers = 2.8408802181856725;

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

    @Test
    void testParameter2() {
        int tier = 2;
        Parameter parameter = new Parameter(tier);

        // Expected values for tier 2
        double expectedP1 = 0.1694915254237288;
        double expectedP2 = 0.3559322033898305;
        double expectedP3 = 0.3220338983050847;
        double expectedP4 = 0.11864406779661017;
        double expectedP5 = 0.03389830508474576;
        double expectedMeanGPA = 0.875508474576271;
        double expectedSdGPA = 0.0476670828666101;
        double expectedMeanOthers = 4.288135593220339;
        double expectedSdOthers = 2.7231500994355975;

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

    @Test
    void testParameter3() {
        int tier = 3;
        Parameter parameter = new Parameter(tier);

        // Expected values for tier 3
        double expectedP1 = 0;
        double expectedP2 = 0.13559322033898305;
        double expectedP3 = 0.3898305084745763;
        double expectedP4 = 0.3050847457627119;
        double expectedP5 = 0.1694915254237288;
        double expectedMeanGPA = 0.8216101694915255;
        double expectedSdGPA = 0.037236900936437875;
        double expectedMeanOthers = 4.423728813559322;
        double expectedSdOthers = 3.1360165256783783;

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
    @Test
    void testParameter4() {
        // Test for AdmissionTier=4
        int tier = 4;
        Parameter parameter = new Parameter(tier);

        // Expected values for tier 4
        double expectedP1 = 0.01694915254237288;
        double expectedP2 = 0.01694915254237288;
        double expectedP3 = 0.1016949152542373;
        double expectedP4 = 0.4067796610169492;
        double expectedP5 = 0.4576271186440678;
        double expectedMeanGPA = 0.7465254237288136;
        double expectedSdGPA = 0.045336426677331794;
        double expectedMeanOthers = 4.254237288135593;
        double expectedSdOthers = 2.776708671461922;

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

    @Test
    void testParameter5() {
        // Test for AdmissionTier=5
        int tier = 5;
        Parameter parameter = new Parameter(tier);

        // Expected values for tier 5
        double expectedP1 = 0;
        double expectedP2 = 0;
        double expectedP3 = 0.018867924528301886;
        double expectedP4 = 0.1509433962264151;
        double expectedP5 = 0.8301886792452831;
        double expectedMeanGPA = 0.6941509433962264;
        double expectedSdGPA = 0.03836484580085861;
        double expectedMeanOthers = 1.9245283018867925;
        double expectedSdOthers = 0.8285542692354043;

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
    @Test
    public void getTierTest() {
        assertEquals(1, parameter.getTier());
    }

    @Test
    public void getP1Test() {
        assertEquals(0.1, parameter.getP1());
    }

    @Test
    public void getP2Test() {
        assertEquals(0.2, parameter.getP2());
    }

    @Test
    public void getP3Test() {
        assertEquals(0.3, parameter.getP3());
    }

    @Test
    public void getP4Test() {
        assertEquals(0.4, parameter.getP4());
    }

    @Test
    public void getP5Test() {
        assertEquals(0.5, parameter.getP5());
    }

    @Test
    public void getmeanGPATest() {
        assertEquals(3.5, parameter.getmeanGPA());
    }

    @Test
    public void getsdGPATest() {
        assertEquals(0.5, parameter.getsdGPA());
    }

    @Test
    public void getmeanOthersTest() {
        assertEquals(4.0, parameter.getmeanOthers());
    }

    @Test
    public void getsdOthersTest() {
        assertEquals(0.4, parameter.getsdOthers());
    }

}