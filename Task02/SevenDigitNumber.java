package task_02;

/**
 * SevenDigitNumber is the class which solves following task:
 * Makes the reverse of a seven-digit number.
 *
 * 4 June 2018
 * @author Arthur Lyup
 */

public class SevenDigitNumber {
    private static final int MAKE_MILLIONS = 1000000;
    private static final int MAKE_HUNDRED_THOUSANDs = 100000;
    private static final int MAKE_TEN_THOUSANDS = 10000;
    private static final int MAKE_THOUSANDS = 1000;
    private static final int MAKE_HUNDREDS = 100;
    private static final int GET_LAST_DIGIT = 10;

    public static int makeReverse(int number){
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
        int f = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int g = number;

        return a*MAKE_MILLIONS + b*MAKE_HUNDRED_THOUSANDs + c*MAKE_TEN_THOUSANDS + d*MAKE_THOUSANDS
                + e*MAKE_HUNDREDS + f*GET_LAST_DIGIT + g;
    }
}
