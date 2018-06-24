package task_03;

/**
 * Letter is the class which solves the following task:
 * Determine whether the letter (symbol) is a vowel letter.
 * Solve it at least by 4 methods.
 *
 * 7 June 2018
 * @author Arthur Lyup
 */

public class Letter {
    //admissible bodreds of vowel letters
    private final static char LEFT_SMALL = 'a';
    private final static char RIGHT_SMALL = 'z';
    private final static int ERROR_CASE = -1;

    //1st method
    public static boolean isVowelBy1stMethod(char symbol) throws Exception {
        if (!isLetter(symbol)){
            throw new Exception("\"" + symbol + "\" isn't a letter!");
        }
        symbol = Character.toLowerCase(symbol);
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y';
    }

    //2nd method
    public static boolean isVowelBy2ndMethod(char symbol) throws Exception {
        if (!isLetter(symbol)){
            throw new Exception("\"" + symbol + "\" isn't a letter!");
        }
        symbol = Character.toLowerCase(symbol);
        switch (symbol){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y': return true;
        }
        return false;
    }

    //3rd method
    public static boolean isVowelBy3rdMethod(char symbol) throws Exception {
        if (!isLetter(symbol)){
            throw new Exception("\"" + symbol + "\" isn't a letter!");
        }
        symbol = Character.toLowerCase(symbol);
        return "aeiouy".contains(Character.toString(symbol));
    }

    //4th method
    public static boolean isVowelBy4thMethod(char symbol) throws Exception {
        if (!isLetter(symbol)){
            throw new Exception("\"" + symbol + "\" isn't a letter!");
        }
        symbol = Character.toLowerCase(symbol);
        return "aeiouy".indexOf(symbol) > ERROR_CASE;
    }

    //check input
    private static boolean isLetter(char symbol) throws Exception {
        symbol = Character.toLowerCase(symbol);
        return symbol >= LEFT_SMALL || symbol <= RIGHT_SMALL;
    }
}
