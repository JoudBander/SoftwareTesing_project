/**
 * 
 */

package testing;

public class PerfectSquare {

    public static boolean isPerfectSquare(int inputNumber) {

        if (inputNumber < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }

        int i = 0;

        while (i * i < inputNumber) {
            i++;
        }

        if (i * i == inputNumber) {
            return true;
        } else {
            return false;
        }
    }
}
