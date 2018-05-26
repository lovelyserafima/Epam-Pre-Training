package task_02;

/**
 * Swap is the class which solves following task:
 * Swap two values without using other variables.
 */

public class Swap {
    public Swap(){}

    public static void swapNumbers(int a, int b){
        System.out.println("\nBefore swap:\n a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("After swap:\n a = " + a + ", b = " + b);
    }
}
