package task_04;

/**
 * Task04 is the class with the method main(String[]args)
 *
 * 2 June 2018
 * @author Arthur Lyup
 */

public class Task04 {
    public static void main(String[]args) throws Exception {
        //task1
        int number = 1000;
        System.out.println(Coin.tossCoin(number));

        //task2
        number = 123321;
        System.out.println("\nThe options of number " + number + ":");
        System.out.println("1)Max digit of the number -> " + NaturalNumber.findMaxDigit(number));
        System.out.println("2)Palindrome -> " + NaturalNumber.checkPalindrome(number));
        System.out.println("3)Simplicity -> " + NaturalNumber.checkSimplicity(number));
        System.out.println("4)Simple dividers -> " + NaturalNumber.findSimpleDividers(number));
        System.out.println("5)Number of different digits -> " + NaturalNumber.countNumberOfDifferentDigits(number));

        int number2 = 36;
        System.out.println("\nGCD(" +  number2 +"," + number + ") = " + NaturalNumber.findGCD(number, number2));
        System.out.println("LCM(" +  number2 +"," + number + ") = " + NaturalNumber.findLCM(number, number2));

        //task3
        number = 496;
        System.out.println("\nIs " + number + " a perfect number? -> " + NaturalNumber.checkPerfection(number));
    }
}
