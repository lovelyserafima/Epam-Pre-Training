package task_02;

/**
 * FourDigitNumber is the class which solves following task:
 * Finds average arithmetic and geometric of digits of the six-digit number.
 *
 * 4 June 2018
 * @author Arthur Lyup
 */

public class SixDigitNumber {
    //constants for calculating
    private static final int GET_LAST_DIGIT = 10;
    private static final double NUMBER_OF_DIGITS = 6.;
    private static final double EXPONENT = 1.0/6.0;
    public SixDigitNumber(){}

    //finds average arithmetic
    public static double findAvrArthm(int number){
        int a = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int b = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int c = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int d = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int e = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int f = number;
        return (a + b + c + d + e + f)/NUMBER_OF_DIGITS;
    }

    //finds average geometric
    public static double findAvrGeom(int number){
        int a = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int b = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int c = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int d = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int e = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int f = number;
        return Math.pow(a*b*c*d*e*f, EXPONENT);
    }
}
