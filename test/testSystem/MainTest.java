package testSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import System.Main;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {

	@Test
	public void testLoginAndRegister1() {
		
		
		//------------------------------WARNING!!!!------------------------------------
		
		/* SINCE COMMAND LINE ARGUMENTS ARE HARD TO PASS IN JUNIT 5 TEST, THE BELOW USES MANUALL TESTING IN THE SECOND PART, AND 
		 * BYTE REPLACE OF STDIN IN THE FIRST PART THEREBY ACHIEVING ADEQUATE MAIN TESTING
		 * YOU NEED TO UNCOMMENT TO TEST IT OUT, 
		 * THE REASON IT IS COMMENTED IS BECAUSE IT IS INSTANCE SPECIFIC, AND FIRST TEST MIGHT FAIL IF YUO DON'T PUT CORRECT DATA,
		 * YOU NEED TO MODIFY IT TO MATCH THE PRESENT MOMENT RELEVANT DATA (CSV FILES MIGHT CHANGE)
		 * */
		
	    /*// Prepare the input data
	    String inputData = "Log in\n341002\n888888\n1\nhuila\n888888\nc\n2\n1\nnew\nnew\nStudent\nq\n2\n241006\n4\n3\n241005\nq\n4\n1\nnewuni\nUSA\n3\n4\n2\n";
	    InputStream stdin = System.in;
	    try {
	        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

	        // Run the main method
	        Main.main(new String[]{});
	    } finally {
	        // Reset the System.in
	        System.setIn(stdin);
	    }
	    
	    // Prepare the input data for second main
	    String inputData2 = "input3\ninput4\n";
	    try {

	        Main.main(new String[]{});
	    } finally {
	        // Reset the System.in
	        System.setIn(stdin);
	    }*/
	}

}
