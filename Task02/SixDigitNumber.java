package task_02;

/**
 * FourDigitNumber is the class which solves following task:
 * Finds average arithmetic and geometric of digits of the six-digit number.
 */

public class SixDigitNumber {
    public SixDigitNumber(){}

    //finds average arithmetic
    public static double findAvrArthm(int number){
        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;
        number /= 10;
        int e = number % 10;
        number /= 10;
        int f = number;
        return ((a + b + c + d + e + f)/6);
    }

    //finds average geometric
    public static double findAvrGeom(int number){
        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;
        number /= 10;
        int e = number % 10;
        number /= 10;
        int f = number;
        return Math.pow(a*b*c*d*e*f, 1.0/6.0);
    }
}
