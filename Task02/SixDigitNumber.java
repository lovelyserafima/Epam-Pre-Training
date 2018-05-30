package task_02;

/**
 * FourDigitNumber is the class which solves following task:
 * Finds average arithmetic and geometric of digits of the six-digit number.
 */

public class SixDigitNumber {
    private static final int TEN = 10;
    public SixDigitNumber(){}

    //finds average arithmetic
    public static double findAvrArthm(int number){
        int a = number % TEN;
        number /= TEN;
        int b = number % TEN;
        number /= TEN;
        int c = number % TEN;
        number /= TEN;
        int d = number % TEN;
        number /= TEN;
        int e = number % TEN;
        number /= TEN;
        int f = number;
        return (a + b + c + d + e + f)/6.0;
    }

    //finds average geometric
    public static double findAvrGeom(int number){
        int a = number % TEN;
        number /= TEN;
        int b = number % TEN;
        number /= TEN;
        int c = number % TEN;
        number /= TEN;
        int d = number % TEN;
        number /= TEN;
        int e = number % TEN;
        number /= TEN;
        int f = number;
        return Math.pow(a*b*c*d*e*f, 1.0/6.0);
    }
}
