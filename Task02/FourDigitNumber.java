package task_02;

/**
 * FourDigitNumber is the class which solves following task:
 * Check that numbers of the four-digit number N form an increasing
 * (decreasing) sequence.
 *
 * 26 May 2018
 * @author
 */

public class FourDigitNumber {
    public FourDigitNumber(){}

    //check increase sequence
    public static boolean checkIncSequnce(int number){
        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number;
        return ((d < c) && (c < b) && (b < a));
    }

    //check decrease sequence
    public static boolean checkDecSequnce(int number){
        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number;
        return ((d > c) && (c > b) && (b > a));
    }

}
