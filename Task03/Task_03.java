package task_03;

/**
 * Task03 is the class with the method main(String[]args)
 *
 * 29 May 2018
 * @author Arthur Lyup
 */
public class Task_03 {
    public static void main(String[] args) throws Exception {
        //task1
        double x1 = 0.0;
        double y1 = 3.0;

        double x2 = 4.0;
        double y2 = 0.0;

        double x3 = 0.0;
        double y3 = 0.0;

        System.out.println("(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")," + "(" + x3 + "," + y3 + ")");
        System.out.println(Triangle.makeTriangle(x1, y1, x2, y2, x3, y3));
        x1 = 0.0;
        y1 = 0.0;
        System.out.println("(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")," + "(" + x3 + "," + y3 + ")");
        System.out.println(Triangle.makeTriangle(x1, y1, x2, y2, x3, y3));

        //task2
        double age = 250;
        System.out.println("\nDragon with age = " + age + " years old has " + Dragon.countHeads(age) + " heads"
        + " and " + Dragon.countEyes(age) + " eyes");

        //task3
        char letter = 'a';
        //different methods
        System.out.println("\nIs letter \"" + letter + "\" a vowel? -> " + Letter.checkVowelBy1stMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.checkVowelBy2ndMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.checkVowelBy3rdMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.checkVowelBy4thMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.checkVowelBy5thMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.checkVowelBy6thMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.checkVowelBy7thMethod(letter));

        //task4
        System.out.println("\n" + MoodSensor.getMood());
        System.out.println(MoodSensor.getMood());

        //task5
        int day = 31;
        int month = 12;
        int year = 2000;
        System.out.println("\n" + day + "." + month + "." + year + ": " + Calendar.identifyNextDay(day, month, year));



    }
}
