package task_03;

/**
 * Letter is the class which solves the following task:
 * Determine whether the letter (symbol) is a vowel letter.
 * Solve it at least by 4 methods.
 *
 * 30 May 2018
 * @author Arthur Lyup
 */

public class Letter {
    //admissible bodreds of letters in table ASCII
    private final static char leftBig = 'A';
    private final static char rightBig = 'Z';
    private final static char leftSmall = 'a';
    private final static char rightSmall = 'z';

    //the empty constructor
    public Letter(){}

    //1st method
    public static boolean checkVowelBy1stMethod(char symbol) throws Exception {
        checkLetter(symbol);
        return symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U' ||
                symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }

    //2nd method
    public static boolean checkVowelBy2ndMethod(char symbol) throws Exception {
        checkLetter(symbol);
        return symbol == 65 || symbol == 69 || symbol == 73 || symbol == 79 || symbol == 85 ||
                symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117;
    }

    //3rd method
    public static boolean checkVowelBy3rdMethod(char symbol) throws Exception {
        checkLetter(symbol);
        switch (symbol){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default: return false;
        }
    }

    //4th method
    public static boolean checkVowelBy4thMethod(char symbol) throws Exception {
        checkLetter(symbol);
        switch (symbol){
            case 65:
            case 69:
            case 73:
            case 79:
            case 85:
            case 97:
            case 101:
            case 105:
            case 111:
            case 117: return true;
            default: return false;
        }
    }

    //5th method
    public static boolean checkVowelBy5thMethod(char symbol) throws Exception {
        checkLetter(symbol);
        if (symbol == 'A'){
            return true;
        } else if (symbol == 'E'){
            return true;
        } else if (symbol == 'I'){
            return true;
        } else if (symbol == 'O'){
            return true;
        } else if (symbol == 'U') {
            return true;
        } else if (symbol == 'a') {
            return true;
        } else if (symbol == 'e') {
            return true;
        } else if (symbol == 'i') {
            return true;
        } else if (symbol == 'o') {
            return true;
        } else if (symbol == 'u') {
            return true;
        } else return false;
    }

    //6th method
    public static boolean checkVowelBy6thMethod(char symbol) throws Exception {
        checkLetter(symbol);
        if (symbol == 65){
            return true;
        } else if (symbol == 69){
            return true;
        } else if (symbol == 73){
            return true;
        } else if (symbol == 79){
            return true;
        } else if (symbol == 85) {
            return true;
        } else if (symbol == 97) {
            return true;
        } else if (symbol == 101) {
            return true;
        } else if (symbol == 105) {
            return true;
        } else if (symbol == 111) {
            return true;
        } else if (symbol == 117) {
            return true;
        } else return false;
    }

    //7th method
    public static boolean checkVowelBy7thMethod(char symbol) throws Exception {
        checkLetter(symbol);
        String vowels = "AaEeIiOoUu";
        return vowels.contains(Character.toString(symbol));
    }

    //check input
    private static void checkLetter(char symbol) throws Exception {
        if (symbol < leftBig || (symbol > rightBig && symbol < leftSmall) || symbol > rightSmall)
            throw new Exception("\"" + symbol + "\" isn't a letter!");
    }
}
