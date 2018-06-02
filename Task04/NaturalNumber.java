package task_04;

import javax.naming.Name;

/**
 * NaturalNumber is the class which has the following methods:
 * 1)find max digit in the natural number
 * 2)check whether the natural number is palindrome
 * 3)check whether the natural number is simple
 * 4)find all simple deviders of the natural number
 * 5)find GCD and LCM of two natural numbers
 * 6)find the number of different digits in the natural number
 * 7)check whether the natural number is perfect
 *
 * 2 June 2018
 * @author Arthur Lyup
 */

public class NaturalNumber {
    //static final values for operations
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int TEN = 10;

    //find max digit in the number
    public static int findMaxDigit(int number) throws Exception {
        checkNumber(number);//check input
        int max = number % TEN;
        number /= TEN;
        while (number > 0){
            if (number % TEN > max){
                max = number % TEN;
            }
            number /= TEN;
        }
        return max;
    }

    //check whether the number is palindrome
    public static boolean checkPalindrome(int number) throws Exception {
        checkNumber(number);
        if (number < TEN){//if a single-valued number
            return true;
        }
        int reverse = 0;
        int memory = number;//because we destroy number
        while (memory > 0){
            reverse = reverse*TEN + memory % TEN;
            memory /= TEN;
        }
        return number == reverse;
    }

    //check whether the number is simple
    public static String checkSimplicity(int number) throws Exception {
        checkNumber(number);//check input
        if (number == ONE){//number 1 is an exception
            return "It isn't a simple number and composite number.";
        }
        if (number == TWO){//if it is even number
            return "true";
        }
        if (number % TWO == 0){//special event
            return "false";
        }
        for (int i = 3; i < number/TWO; i+=TWO){//the main algoritm
            if (number % i == 0){
                return "false";
            }
        }
        return "true";
    }

    //find simple dividers of number
    public static String findSimpleDividers(int number) throws Exception {
        checkNumber(number);//check input
        if (number == 1){
            return "false";
        }
        String dividers = "";//our simple dividers
        if (checkSimplicity(number) == "false") {//if number isn't simple
            for (int i = ONE; i <= number / 2; i++) {
                if (number % i == 0) {
                    if (checkSimplicity(i) == "true") {
                        dividers += i + " ";
                    }
                }
            }
        } else {//if number is simple, the only one simple divider is the number
            dividers += number;
        }
        return dividers;
    }

    //find GCD of two numbers
    public static int findGCD(int number1, int number2) throws Exception {
        checkNumber(number1);//check input
        checkNumber(number2);
        while (number1 != 0 && number2 != 0){
            if (number1 > number2){
                number1 %= number2;
            } else {
                number2 %= number1;
            }
        }
        return number1 + number2;
    }

    //find LCM of two numbers
    public static int findLCM(int number1, int number2) throws Exception {
        checkNumber(number1);//check input
        checkNumber(number2);
        return number1/findGCD(number1,number2) * number2;//number1*number2/findGCD(number1,number2) is worse than this expression
                                                          //because of overflowing int
    }

    //count number of different digits in the number
    public static int countNumberOfDifferentDigits(int number) throws Exception {
        checkNumber(number);//check input
        if (number < TEN){//if a single-valued number
            return ONE;
        }
        int counterOfDifferentDigits = 0;
        for (int i = 0; i < TEN; i++){
            int memory = number;
            while(memory > 0){
                if (memory % TEN == i){
                    counterOfDifferentDigits++;
                    break;
                }
                memory /= TEN;
            }
        }
        return counterOfDifferentDigits;
    }

    //check whether is the number if perfect
    public static boolean checkPerfection(int number) throws Exception {
        checkNumber(number);//check input
        if (number < 6 || checkSimplicity(number) == "true"){
            return false;
        }
        int sum = ONE;
        for (int i = TWO; i <= number/TWO; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return number == sum;
    }

    //check input
    private static void checkNumber(int number) throws Exception {
        if (number < ONE){
            throw new Exception("Wrong Input! " + number + " isn't a natural number");
        }
    }
}
