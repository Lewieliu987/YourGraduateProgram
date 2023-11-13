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
        university1 = new University("Harvard", "USA", "1");
        university2 = new University("Stanford", "USA", "1");
    }

    @Test
    public void getInstanceTest() {
        assertNotNull(DatabaseForUniversity.getInstance());
    }

    @Test
    public void findNonExistentUniversityTest() {
    	assertNull(database.findUniversity("NonExistent"));
    }
    
   
}