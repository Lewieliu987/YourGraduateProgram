package testSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import System.IdSystem;

import static org.junit.jupiter.api.Assertions.*;

public class IdSystemTest {
    private IdSystem idSystem;

    @BeforeEach
    public void setup() {
        idSystem = IdSystem.getInstance();
    }

    @Test
    public void testGetInstance() {
        IdSystem instance = IdSystem.getInstance();
        assertNotNull(instance, "Instance should not be null");
        assertEquals(instance, idSystem, "Instances should match");
    }

    @Test
    public void testGenerateUserIdForAdmin() {
        int adminId1 = idSystem.generateUserId(true);
        int adminId2 = idSystem.generateUserId(true);

        assertEquals(341000, adminId1, "First admin ID should be 341000");
        assertEquals(341001, adminId2, "Second admin ID should be 341001");
    }

    @Test
    public void testGenerateUserIdForStudent() {
        int studentId1 = idSystem.generateUserId(false);
        int studentId2 = idSystem.generateUserId(false);

        assertEquals(241000, studentId1, "First student ID should be 241000");
        assertEquals(241001, studentId2, "Second student ID should be 241001");
    }
}
