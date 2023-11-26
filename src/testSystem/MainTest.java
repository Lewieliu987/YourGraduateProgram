package testSystem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import System.Main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {

    private Main mainInstance;
    private final InputStream originalIn = System.in;
    @BeforeEach
    public void setup() {
        mainInstance = new Main();
        
    }

    /*@Test
    public void testLoginAndRegister() {
        // First, simulate a login action
        String loginInput = "Log in\n241002\nnewopa2289\n1\nHui\nnewopa2289\nc\n2\nMaster\n1\n3\n15/5\n15\5\n7.5\n105\140\n1\n3\n2\n1\n2\n4\n1\n3\n1\n5";
        InputStream loginIn = new ByteArrayInputStream(loginInput.getBytes());
        System.setIn(loginIn);
        mainInstance.main(new String[]{})


        // Optionally: make assertions to verify behavior
    }*/
    @Test
    public void testLoginAndRegister2() {
        // First, simulate a login action
        String loginInput = "Log in\n241002\nnewopa2289\n3\nMaster\n1\n3\n15/5\n15/5\n7.5\n105\140\n0\n0\n0\n2\n12\n";
        InputStream loginIn = new ByteArrayInputStream(loginInput.getBytes());
        System.setIn(loginIn);
        mainInstance.main(new String[]{});


        // Optionally: make assertions to verify behavior
    }
}