package testUniversity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import University.Program;
import Value.Major;

class ProgramTest {
	
	private Program program;
	@BeforeEach
    void setUp() {
        Major major = new Major();
        major.setMajorName("Test Major");
        program = new Program("Test ID", "Test Program", "Test Degree Type", 0.5, "Test Major");
    }

    @Test
    void testId() {
        // Arrange
        String expectedId = "Test ID";

        // Assert
        assertEquals(expectedId, program.getId());
    }

    @Test
    void testName() {
        // Arrange
        String expectedName = "Test Program";

        // Assert
        assertEquals(expectedName, program.getName());
    }

    @Test
    void testDegreeType() {
        // Arrange
        String expectedDegreeType = "Test Degree Type";

        // Assert
        assertEquals(expectedDegreeType, program.getDegreeType());
    }

    @Test
    void testAcceptanceRate() {
        // Arrange
        double expectedAcceptanceRate = 0.5;

        // Assert
        assertEquals(expectedAcceptanceRate, program.getAcceptanceRate(), 0.0001);
    }

    @Test
    void testMajorName() {
        // Arrange
        String expectedMajorName = "Test Major";

        // Assert
        assertEquals(expectedMajorName, program.getMajorName());
    }

}
