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

    @BeforeEach
    void setUp() {
        everyInternship = new EveryInternship(/* parameters as needed */);
        ArrayList<EveryInternship> internships = new ArrayList<>();
        internships.add(everyInternship);
        internship = new Internship(internships);
    }

    @Test
    void testAddInternship() {
        // Arrange
        EveryInternship newInternship = new EveryInternship(/* parameters as needed */);

        // Act
        internship.addInternship(newInternship);

        // Assert
        assertEquals(newInternship, internship.getInternships().get(1));
    }
}