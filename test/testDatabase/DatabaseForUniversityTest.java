package testDatabase;

import University.University;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Database.DatabaseForUniversity;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseForUniversityTest {
    private DatabaseForUniversity database;
    private University university1;
    private University university2;
    

    @BeforeEach
    public void setup() throws IOException {
        database = DatabaseForUniversity.getInstance();
        database.readUniversitiesFromCSV();
        //database.writeUniversitiesToCSV();

    }

    @Test
    public void getInstanceTest() {
        assertNotNull(DatabaseForUniversity.getInstance());
    }

    @Test
    public void findNonExistentUniversityTest() {
    	assertNull(database.findUniversity("NonExistent"));
    }
    @Test
    public void addUniversityTest() {
    	
    	try { 		

    	 	String expectedName="Harvard University";
    	 	university2 = database.findUniversity(expectedName);
    	 	System.out.println(university2.getName());
    	 	assertEquals(university2.getName(), expectedName);
    	 	
    	} catch(Exception e) {
    		System.out.println(e);
    	}
    	
    	
    }
    
   
}