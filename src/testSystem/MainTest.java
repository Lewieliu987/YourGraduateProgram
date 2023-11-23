package testSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import System.Main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {

    private Main mainInstance;

    @BeforeEach
    public void setup() {
        mainInstance = new Main();
    }

    @Test
    public void testLogin() {
        String input = "Register\n1234\nmypassword\nStudent";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Execute main function here
        mainInstance.main(new String[]{});
        System.setIn(System.in);
        // Add assertions here to validate the expected behavior
    }

    @Test
    public void testRegister() {
        String input = "Register\nJohn\nmypassword\nStudent";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Execute main function here
        // mainInstance.main(new String[]{});

        // Add assertions here to validate the expected behavior
    }//241240
}