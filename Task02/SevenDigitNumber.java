package task_02;

/**
 * SevenDigitNumber is the class which solves following task:
 * Makes the reverse of a seven-digit number.
 */

public class SevenDigitNumber {
    public SevenDigitNumber(){}

    public static void makeReverse(int number){
        System.out.print("Reverse of " + number + " = ");
        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number % 10;
        number /= 10;
        int d = number % 10;
        number /= 10;
        int e = number % 10;
        number /= 10;
        int f = number % 10;
        number /= 10;
        int g = number;

        System.out.println(a*1000000 + b*100000 + c*10000 + d*1000 + e*100 + f*10 + g);
    }
}
