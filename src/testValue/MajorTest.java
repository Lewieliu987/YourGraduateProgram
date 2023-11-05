package testValue;

import Value.Major;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorTest {
    private Major major;

    @BeforeEach
    void setUp() {
        major = new Major("Computer Science");
    }

    @Test
    void testGetMajorName() {
        // Arrange
        String expectedMajorName = "Computer Science";

        // Assert
        assertEquals(expectedMajorName, major.getMajorName());
    }

    @Test
    void testSetMajorName() {
        // Arrange
        String newMajorName = "Data Science";

        // Act
        major.setMajorName(newMajorName);

        // Assert
        assertEquals(newMajorName, major.getMajorName());
    }
}