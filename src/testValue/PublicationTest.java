package testValue;

import Value.EveryPublication;
import Value.Publication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicationTest {
    private Publication publication;
    private EveryPublication everyPublication;

    @BeforeEach
    void setUp() {
        everyPublication = new EveryPublication(/* parameters as needed */);
        ArrayList<EveryPublication> publications = new ArrayList<>();
        publications.add(everyPublication);
        publication = new Publication(publications);
    }

    @Test
    void testAddPublication() {
        // Arrange
        EveryPublication newPublication = new EveryPublication(/* parameters as needed */);

        // Act
        publication.addPublication(newPublication);

        // Assert
        assertEquals(newPublication, publication.getPublications().get(1));
    }
}