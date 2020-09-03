import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testMedian() {
        // 1, 2, 3
        assertEquals(2, MyMain.median(1, 2, 3), "The median of 1, 2, and 3 should be: 2");
        assertEquals(2, MyMain.median(2, 3, 1), "The median of 2, 3, and 1 should be: 2");
        assertEquals(2, MyMain.median(3, 1, 2), "The median of 3, 1, and 2 should be: 2");
        
        // -7, 0, 20
        assertEquals(0, MyMain.median(-7, 0, 20), "The median of -7, 0, and 20 should be: 0");
        assertEquals(0, MyMain.median(0, 20, -7), "The median of 0, 20, and -7 should be: 0");
        assertEquals(0, MyMain.median(20, -7, 0), "The median of 20, -7, and 0 should be: 0");
    }

    @Test
    public void testMagnitude() {
        assertEquals(-7, MyMain.magnitude(-7, -1), "The larger magnitude of -7 and -1 should be: -7");
        assertEquals(-100, MyMain.magnitude(-5, -100), "The larger magnitude of -5 and -100 should be: -100");
        assertEquals(50, MyMain.magnitude(20, 50), "The larger magnitude of 20 and 50 should be: 50");
        assertEquals(50, MyMain.magnitude(50, 20), "The larger magnitude of 50 and 20 should be: 50");
        assertEquals(-7, MyMain.magnitude(-7, 2), "The larger magnitude of -7 and 2 should be: -7");
        assertEquals(20, MyMain.magnitude(-7, 20), "The larger magnitude of -7 and 20 should be: 20");
    }

    @Test
    public void testPythagoras() {
        assertEquals(5.0, MyMain.pythagoras(3, 4), "The output of the pythagoras theorem with 3 and 4 should be: 5.0");
        assertEquals(13.0, MyMain.pythagoras(5, 12), "The output of the pythagoras theorem with 5 and 12 should be: 13.0");
        assertEquals(25.0, MyMain.pythagoras(7, 24), "The output of the pythagoras theorem with 7 and 24 should be: 25.0");
        assertEquals(17.0, MyMain.pythagoras(8, 15), "The output of the pythagoras theorem with 8 and 15 should be: 17.0");
        assertEquals(41.0, MyMain.pythagoras(9, 40), "The output of the pythagoras theorem with 9 and 40 should be: 41.0");
        assertEquals(61.0, MyMain.pythagoras(11, 60), "The output of the pythagoras theorem with 11 and 60 should be: 61.0");
    }
}
