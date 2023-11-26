package testValue;

import Value.EveryPublication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EveryPublicationTest {
    private EveryPublication everyPublication;

    @BeforeEach
    void setUp() {
        everyPublication = new EveryPublication(3);
    }

    @Test
    void testLevel() {
        // Arrange
        int expectedLevel = 3;

        // Assert
        assertEquals(expectedLevel, everyPublication.getLevel());
    }
}