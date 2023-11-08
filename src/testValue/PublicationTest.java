package testValue;

import Value.EveryPublication;
import Value.Publication;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicationTest {
 
    @Test
    void testAddPublication() {
        int expectedLevel = 3;
        EveryPublication everyPublication = new EveryPublication(expectedLevel);
        Publication publication = new Publication();
        publication.addPublication(everyPublication);

        // Assert
        assertEquals(expectedLevel, publication.getPublications().get(0).getLevel());
    }
}