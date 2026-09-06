package testing;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Name: Reenad Alqahtani
 * ID: 445009118
 * Email: 445009118@pnu.edu.sa
 * Section: 6C2
 * Group Number: 4
 * Contribution: Input Space Partitioning (ISP)
 */
public class ISPTest {

    // Test Case 1: Negative numbers
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        PerfectSquare.isPerfectSquare(-5);
    }

    // Test Case 2: Zero (Boundary case)
    @Test
    public void testZeroInput() {
        assertTrue("Zero should be a perfect square", PerfectSquare.isPerfectSquare(0));
    }

    // Test Case 3: Positive Perfect Square
    @Test
    public void testPositivePerfectSquare() {
        assertTrue("16 should be recognized as a perfect square", PerfectSquare.isPerfectSquare(16));
    }

    // Test Case 4: Positive Non-Perfect Square
    @Test
    public void testPositiveNonPerfectSquare() {
        assertFalse("7 is not a perfect square", PerfectSquare.isPerfectSquare(7));
    }
}