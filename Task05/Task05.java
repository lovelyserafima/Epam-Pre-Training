package task_05;

/**
 * Task05 is the class with the method main(String[]args)
 *
 * 24 June 2018
 * @author Arthur Lyup
 */

public class Task05 {
    public static void main (String[] args) throws Exception {
        int n = 5;//n elements in array
        double[] array = new double[n];
        //our borders of randoming
        double leftBorder = -10.0;
        double rightBorder = 10.0;
        ArrayInitializer.initializeArray(array, leftBorder, rightBorder);
        System.out.println("Source array:\n" + java.util.Arrays.toString(array));

        //task1
        System.out.println("\n1)Max element = " + ArrayWorker.findMaxElement(array));
        System.out.println("2)Min element = " + ArrayWorker.findMinElement(array));

        //task2
        System.out.println("3)Average arithmetic = " + ArrayWorker.findAverageArithmetic(array));
        System.out.println("4)Average geometric = " + ArrayWorker.findAverageGeometric(array));

        //task3
        System.out.println("5)Increase array -> " + ArrayWorker.isIncArray(array));
        System.out.println("6)Decrease array -> " + ArrayWorker.isDecArray(array));

        //task4
        System.out.println("7)Index of local minimum = " + ArrayWorker.findIndexOfLocalMin(array));
        System.out.println("8)Index of local maximum = " + ArrayWorker.findIndexOfLocalMax(array));

        //task5
        System.out.println("9)Array after reverse:");
        ArrayWorker.reverseArray(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}
