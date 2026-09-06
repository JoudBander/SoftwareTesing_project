package testing;

import testing.PerfectSquare;
import static org.junit.Assert.*;
import org.junit.Test;

//Name: Joud Bander Al Thonayan 
//ID: 445008632 
//Email: 445008632@pnu.edu.sa 
//Section: 6C2 
//Group: 4 
//Contribution: Control Flow Graph analysis, Edge-Pair Coverage,  
//            Test Paths identification, and TestPaths.java test class 
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
