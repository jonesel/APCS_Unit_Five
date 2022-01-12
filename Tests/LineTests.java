import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class LineTests {

    private static Line line1 = new Line(5, 4, -17);
    private static Line line2 = new Line(-25, 40, 30);
    private static Line line3 = new Line(-10, -8, 20);

    @Test
    public void lineTestGetSlope() {
        assertEquals(-1.25, line1.getSlope());
        assertEquals(0.625, line2.getSlope());
        assertEquals(-1.25, line3.getSlope());
    }

    @Test
    public void lineTestIsOnLine() {
        assertTrue(line1.isOnLine(5, -2));
        assertFalse(line2.isOnLine(5, -2));
        assertFalse(line3.isOnLine(5, -2));
    }

    @Test
    public void lineTestIsParallel() {
        assertFalse(line1.isParallel(line2));
        assertTrue(line1.isParallel(line3));

    }

    @Test
    public void lineTestToString() {
        String str_line1 = "5x + 4y + -17 = 0";
        String str_line2 = "-25x + 40y + 30 = 0";
        String str_line3 = "-10x + -8y + 20 = 0";
        assertEquals(str_line1, line1.toString());
        assertEquals(str_line2, line2.toString());
        assertEquals(str_line3, line3.toString());
    }


}
