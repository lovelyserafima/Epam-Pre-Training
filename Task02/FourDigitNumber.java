package task_02;

/**
 * FourDigitNumber is the class which solves following task:
 *
 *
 * 26 May 2018
 * @author Arthur Lyup
 */

public class FourDigitNumber {
    private static final int TEN = 10;
    public FourDigitNumber(){}

    //check increase sequence
    public static boolean checkIncSequnce(int number){
        int a = number % TEN;
        number /= TEN;
        int b = number % TEN;
        number /= TEN;
        int c = number % TEN;
        number /= TEN;
        int d = number;
        return d < c && c < b && b < a;
    }

    //check decrease sequence
    public static boolean checkDecSequnce(int number){
        int a = number % TEN;
        number /= TEN;
        int b = number % TEN;
        number /= TEN;
        int c = number % TEN;
        number /= TEN;
        int d = number;
        return d > c && c > b && b > a;
    }

}
