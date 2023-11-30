package testDatabase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Database.DatabaseForUser;
import User.Admin;
import User.Student;
import User.User;
import Exceptions.UserNotFoundException;

class DatabaseForUserTest {
    private DatabaseForUser db;

    @BeforeEach
    void setUp() {
        db = DatabaseForUser.getInstance();
        // Clear the database before each test'
        db.readUsersFromCSV();
    }

    @Test
    void testAddUser() {
        User user = new Student("Test User", "Test Password");
        db.addUser(user);
        assertNotNull(db.findUser(user.getId()));
    }
    
    @Test
    void testFindUser() {
        int expectedId = 241002;
        User foundUser = db.findUser(expectedId);
        assertEquals(foundUser.getUsername(), "www");
    }

    @Test
    void testDeleteUser() {
        int expectedId = 241000;
        try {db.deleteUser(expectedId);
        } catch(Exception e) {
        	System.out.println(e);
        }
        assertNull(db.findUser(expectedId));
    }



    // For readUsersFromCSV() and writeUsersToCSV(), you would need to provide some sort of CSV file for the test to read from and write to.
    // Because these methods involve file I/O, they are more suited for integration testing rather than unit testing.
}