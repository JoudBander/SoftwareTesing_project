package testing;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.experimental.theories.DataPoint;

/**
 * Name: Patol khalid Alkanany
 * ID: 445008681
 * Email: 445008681@pnu.edu.sa 
 * Section: 6C2
 * Group Number: 4
 * Contribution: Theories
 */

@RunWith(Theories.class)
public class PerfectSquareTheoryTest {

    // ─── DataPoints: Perfect Squares ───
    @DataPoints("perfectSquares")
    public static int[] perfectSquares() {
        return new int[]{0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
    }

    // ─── DataPoints: Non-Perfect Squares ───
    @DataPoints("nonPerfectSquares")
    public static int[] nonPerfectSquares() {
        return new int[]{2, 3, 5, 6, 7, 8, 10, 11, 15, 99};
    }

    // ─── DataPoints: Negative Numbers ───
    @DataPoints("negativeNumbers")
    public static int[] negativeNumbers() {
        return new int[]{-1, -4, -9, -16, -100};
    }

    // ─── Theory 1: Any perfect square must return true ───
    @Theory
    public void perfectSquareShouldReturnTrue(
            @org.junit.experimental.theories.FromDataPoints("perfectSquares") int number) {
        assertTrue("Expected true for perfect square: " + number,
                PerfectSquare.isPerfectSquare(number));
    }

    // ─── Theory 2: Any non-perfect square must return false ───
    @Theory
    public void nonPerfectSquareShouldReturnFalse(
            @org.junit.experimental.theories.FromDataPoints("nonPerfectSquares") int number) {
        assertFalse("Expected false for non-perfect square: " + number,
                PerfectSquare.isPerfectSquare(number));
    }

    // ─── Theory 3: Any negative number must throw IllegalArgumentException ───
    @Theory
    public void negativeShouldThrowException(
            @org.junit.experimental.theories.FromDataPoints("negativeNumbers") int number) {
        try {
            PerfectSquare.isPerfectSquare(number);
            fail("Expected IllegalArgumentException for: " + number);
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers are not allowed.", e.getMessage());
        }
    }

    // ─── Theory 4: k*k must always be a perfect square (general mathematical property) ───
    @DataPoints
    public static int[] kValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Theory
    public void squareOfAnyIntegerIsPerfectSquare(int k) {
        int number = k * k;
        assertTrue("k*k must be a perfect square, k=" + k,
                PerfectSquare.isPerfectSquare(number));
    }
}