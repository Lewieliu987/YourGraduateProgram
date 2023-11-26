package testValue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Value.EveryInternship;
public class EveryInternshipTest {
    private EveryInternship everyInternship;
    @BeforeEach
    void setUp() {
        everyInternship = new EveryInternship(5, 6.5);
    }

    @Test
    void testCompanyLevel() {
        // Arrange
        int expectedCompanyLevel = 5;

        // Assert
        assertEquals(expectedCompanyLevel, everyInternship.getCompanyLevel());
    }

    @Test
    void testTimeInterval() {
        // Arrange
        double expectedTimeInterval = 6.5;

        // Assert
        assertEquals(expectedTimeInterval, everyInternship.getTimeInterval(), 0.0001);
    }
}