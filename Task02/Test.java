package task_02;

/**
 * Test is the class with the main method main(String[]).
 *
 * 4 June 2018
 * @author Arthur Lyup
 */

public class Test {
    public static void main(String[] args) {
        //task1
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println(a + " == " + b + " == " + c + " -> " + Numbers.CompareNumbers(a, b, c));

        b = 1;
        c = 1;

        System.out.println(a + " == " + b + " == " + c + " -> " + Numbers.CompareNumbers(a, b, c));

        //task2
        double weight = 50;
        System.out.println("\n" + weight + "kg = "+ Dinosaur.convertWeightToMilligramms(weight) + "mg = "
        + Dinosaur.convertWeightToGrams(weight) + "g = " + Dinosaur.convertWeightToTones(weight) + " tones");

        //task3
        double R1 = 10;
        double R2 = 5;
        System.out.println("\nSquare of the ring = " + Ring.findSquareOfRing(R1, R2));

        //task4
        int number = 1234;
        System.out.println("\n" + number + " makes increase sequence -> " + FourDigitNumber.checkIncSequnce(number));
        System.out.println(number + " makes decrease sequence -> " + FourDigitNumber.checkDecSequnce(number));

        //task5
        number = 123456;
        System.out.println("\nAverage arithmetic of digits of " + number + " = " + SixDigitNumber.findAvrArthm(number));
        System.out.println("Average geometric of digits of " + number + " = " + SixDigitNumber.findAvrGeom(number));

        //task6
        number = 1234567;
        System.out.println("\nReverse of " + number + " is " + SevenDigitNumber.makeReverse(number));

        //task7
        a = 25;
        b = 50;
        System.out.println("\nBefore swap: a = " + a + ", b = " + b);
        System.out.println("After swap: " + Swap.swapNumbers(a, b));
    }
}
