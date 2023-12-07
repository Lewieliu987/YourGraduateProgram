package testUniversity;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import University.Program;
import University.University;

class UniversityTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private University university;
    @BeforeEach
    void setUp() {
        university = new University("Test University", "Test Region", "Test Tier");
    }



	@Test
	void testName() {
	    // Arrange
	    String expectedName = "Test University";

	    // Assert
	    assertEquals(expectedName, university.getName());
	}

	@Test
	void testRegion() {
	    // Arrange
	    String expectedRegion = "Test Region";

	    // Assert
	    assertEquals(expectedRegion, university.getRegion());
	}

	@Test
	void testTier() {
	    // Arrange
	    String expectedTier = "Test Tier";

	    // Assert
	    assertEquals(expectedTier, university.getTier());
	}
	@Test
	void testAddProgram() {

	    String pName = "Master Of Computer Science";
	    String expectedPid = "MOCS";
	    String pType = "Postgraduate";
	    double pRate = 0.8;
	    String pMajorName = "Computer Science";

	    university.addProgram(pName, pType, pRate, pMajorName);

	    Program prog = university.getProgramList().get(0); // get the first program in the list

	    // Check that the program details are correct
	    assertEquals(expectedPid, prog.getId());
	    assertEquals(pName, prog.getName());
	    assertEquals(pType, prog.getDegreeType());
	    assertEquals(pRate, prog.getAcceptanceRate(), 0.01);
	    assertEquals(pMajorName, prog.getMajorName());
	}
	@Test
	void testFindProgram() {
		String pName = "Master Of Computer Science";
	    String expectedPid = "MOCS";
	    String pType = "Postgraduate";
	    double pRate = 0.8;
	    String pMajorName = "Computer Science";

	    university.addProgram(pName, pType, pRate, pMajorName);

	    Program prog = university.findProgram(expectedPid); // get the first program in the list

	    // Check that the program details are correct
	    assertEquals(expectedPid, prog.getId());
	    assertEquals(pName, prog.getName());
	    assertEquals(pType, prog.getDegreeType());
	    assertEquals(pRate, prog.getAcceptanceRate(), 0.01);
	    assertEquals(pMajorName, prog.getMajorName());
	}
    @Test
    public void testShowAllProgram() {

		String pName = "Master Of Computer Science";
	    String expectedPid = "MOCS";
	    String pType = "Postgraduate";
	    double pRate = 0.8;
	    String pMajorName = "Computer Science";
	    System.setOut(new PrintStream(outContent));
	    
	    university.addProgram(pName, pType, pRate, pMajorName);
	    university.showAllProgram();
        String expectedOutput = "MOCS, Master Of Computer Science, Degree Type: Postgraduate, Acceptance Rate: 0.8, Only for Major: Computer Science";
        assertEquals(expectedOutput, outContent.toString());
    }

}
