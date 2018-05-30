package task_02;

/**
 * SevenDigitNumber is the class which solves following task:
 * Makes the reverse of a seven-digit number.
 *
 * 30 May 2018
 */

public class SevenDigitNumber {
    private static final int TEN = 10;
    public SevenDigitNumber(){}

    public static int makeReverse(int number){
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
        int f = number % TEN;
        number /= TEN;
        int g = number;

        return a*1000000 + b*100000 + c*10000 + d*1000 + e*100 + f*10 + g;
    }
}
