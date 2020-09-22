import java.util.Scanner;

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("java.lang.Exception: n or p should not be negative.");
        }
        if (n == 0 || p == 0) {
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        }
        final long pow = (long) Math.pow(n, p);
        return pow;
    }

}

