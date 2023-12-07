package testUser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import User.Admin;

class AdminTest {
    private Admin user;

    @BeforeEach
    void setUp() {
        user = new Admin("Test User", "Test Password");
    }

    @Test
    void testGetName() {
        assertEquals("Test User", user.getUsername());
    }

    @Test
    void testGetPassword() {
        assertEquals("Test Password", user.getPassword());
    }

    @Test
    void testGetId() {
        // Assuming the ID system always generates ID 1 for the first user
        assertEquals(341017, user.getId());
    }

    @Test
    void testGetRole() {
        assertTrue(user.getRole());
    }

    @Test
    void testSetName() {
        user.setName("New User");
        assertEquals("New User", user.getUsername());
    }

    @Test
    void testSetPassword() {
        user.setPassword("New Password");
        assertEquals("New Password", user.getPassword());
    }

    @Test
    void testResetPassword() {
        user.resetPassword("Reset Password");
        assertEquals("Reset Password", user.getPassword());
    }

    @Test
    void testResetName() {
        user.resetName("Reset User");
        assertEquals("Reset User", user.getUsername());
    }

    @Test
    void testGetPermission() {
        assertTrue(user.getPermission());
    }

    @Test
    void testCalculate() {
        // Since calculate() doesn't return anything, we only test if it does not throw an exception
        assertDoesNotThrow(() -> user.calculate());
    }
}