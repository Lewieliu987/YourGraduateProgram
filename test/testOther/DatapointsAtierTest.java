package testOther;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Other.Datapoint;
import Other.DatapointsAtier;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatapointsAtierTest {
    private DatapointsAtier datapointsAtier;
    private ArrayList<Datapoint> database;

    @BeforeEach
    public void setup() {
        database = new ArrayList<>();
        // Add data_points such that we know the expected results
        // Add 10 data_points of each tier background to the database with weighted GPA and weighted Others as 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                database.add(new Datapoint(i, i, 1, 1, 1, 1, 1));
            }
        }

        // Add 50 data_points of tier admission 1 to the database
        datapointsAtier = new DatapointsAtier(1, database);
    }

    @Test
    public void computeP1Test() {
        assertEquals(1, datapointsAtier.computeP1());
    }

    @Test
    public void computeP2Test() {
        assertEquals(0, datapointsAtier.computeP2());
    }

    @Test
    public void computeP3Test() {
        assertEquals(0, datapointsAtier.computeP3());
    }

    @Test
    public void computeP4Test() {
        assertEquals(0, datapointsAtier.computeP4());
    }

    @Test
    public void computeP5Test() {
        assertEquals(0, datapointsAtier.computeP5());
    }

    @Test
    public void computeMeanGTest() {
        assertEquals(1, datapointsAtier.computeMeanG());
    }


    @Test
    public void computeSdGTest() {
        assertEquals(0, datapointsAtier.computeSdG(), 0.001);
    }

    @Test
    public void computeSdOTest() {
        assertEquals(0, datapointsAtier.computeSdO(), 0.001);
    }
}