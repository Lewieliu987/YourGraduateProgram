package testValue;

import Value.Gpa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GpaTest {
    private Gpa gpa;

    @BeforeEach
    void setUp() {
        gpa = new Gpa(3.8, 4.0);
    }

    @Test
    void testCgpa() {
        // Arrange
        double expectedCgpa = 3.8;

        // Assert
        assertEquals(expectedCgpa, gpa.getCgpa(), 0.001);
    }

    @Test
    void testMajorGpa() {
        // Arrange
        double expectedMajorGpa = 4.0;

        // Assert
        assertEquals(expectedMajorGpa, gpa.getMajor_gpa(), 0.001);
    }
}