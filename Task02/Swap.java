package task_02;

/**
 * Swap is the class which solves following task:
 * Swap two values without using other variables.
 *
 * 4 June 2018
 * @author Arthur Lyup
 */

public class Swap {
    public static String swapNumbers(Integer a, Integer b){
        a ^= b;
        b ^= a;
        a ^= b;
        return "a = " + a + ", b = " + b;
    }
}
