package testing;




import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	
	
    private int inputNumber;
    private boolean expectedResult;

    public ParameterizedTest(int inputNumber, boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            // Values related to the identified test paths
            {0, true},   // P2: skip while loop, return true
            {4, true},   // P3: enter loop, return true
            {3, false},  // P4: enter loop, return false

            // Additional perfect square values
            {1, true},
            {9, true},
            {16, true},
            {25, true},

            // Additional non-perfect square values
            {2, false},
            {5, false},
            {8, false},
            {10, false},
            {15, false},
            {26, false}
        });
    }

    @Test
    public void testPerfectSquareParameterized() {
    	assertEquals(expectedResult, PerfectSquare.isPerfectSquare(inputNumber));
    }
}
