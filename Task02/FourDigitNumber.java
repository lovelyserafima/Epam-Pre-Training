package task_02;

/**
 * FourDigitNumber is the class which solves following task:
 * Check whether the digits of the number make increase(decrease) sequence.
 *
 * 4 June 2018
 * @author Arthur Lyup
 */

public class FourDigitNumber {
    private static final int GET_LAST_DIGIT = 10;

    //check increase sequence
    public static boolean checkIncSequnce(int number){
        int a = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int b = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int c = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int d = number;
        return d < c && c < b && b < a;
    }

    //check decrease sequence
    public static boolean checkDecSequnce(int number){
        int a = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int b = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int c = number % GET_LAST_DIGIT;
        number /= GET_LAST_DIGIT;
        int d = number;
        return d > c && c > b && b > a;
    }
}
