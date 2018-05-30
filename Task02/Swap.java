package task_02;

/**
 * Swap is the class which solves following task:
 * Swap two values without using other variables.
 */

public class Swap {
    public Swap(){}

    public static String swapNumbers(int a, int b){
        a += b;
        b = a - b;
        a -= b;
        return "a = " + a + ", b = " + b;
    }
}
