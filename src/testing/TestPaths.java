package testing;

import testing.PerfectSquare;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestPaths {

    @Test(expected = IllegalArgumentException.class)
    public void testPath1_NegativeInput() {
        PerfectSquare.isPerfectSquare(-1);
    }

    @Test
    public void testPath2_ZeroInput() {
        assertTrue(PerfectSquare.isPerfectSquare(0));
    }

    @Test
    public void testPath3_PerfectSquareWithLoop() {
        assertTrue(PerfectSquare.isPerfectSquare(4));
    }

    @Test
    public void testPath4_NotPerfectSquare() {
        assertFalse(PerfectSquare.isPerfectSquare(3));
    }
}
