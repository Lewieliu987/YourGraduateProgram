package testValue;

import Value.EveryInternship;
import Value.Internship;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InternshipTest {
    private Internship internship;
    private EveryInternship everyInternship;



    @Test
    void testAddInternship() {    	
    	int expectedCompanyLevel = 4;
    	double expectedTimeInterval = 2.5;
        everyInternship = new EveryInternship(4, 2.5);
        internship = new Internship();
        internship.addInternship(everyInternship);
        // Assert
        assertEquals(everyInternship.getCompanyLevel(), internship.getInternships().get(0).getCompanyLevel());
        assertEquals(everyInternship.getTimeInterval(), internship.getInternships().get(0).getTimeInterval());
    }

}