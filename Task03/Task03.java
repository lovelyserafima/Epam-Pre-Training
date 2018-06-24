package task_03;

/**
 * Task03 is the class with the method main(String[]args)
 *
 * 7 June 2018
 * @author Arthur Lyup
 */
public class Task03 {
    public static void main(String[] args) throws Exception {
        //task1
        double x1 = 0.0;
        double y1 = 3.0;

        double x2 = 4.0;
        double y2 = 0.0;

        double x3 = 0.0;
        double y3 = 0.0;

        System.out.println("Coordinates: (" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")," + "(" + x3 + "," + y3
                + ")");
        System.out.println("Can they make a triangle? -> " + Triangle.isTriangle(x1, y1, x2, y2, x3, y3));
        System.out.println("Can they make a rectangular triangle? -> "
                + Triangle.isRectangularTriangle(x1, y1, x2, y2, x3, y3));

        //task2
        double age = 250;
        System.out.println("\nDragon with age = " + age + " years old has " + Dragon.countHeads(age) + " heads"
        + " and " + Dragon.countEyes(age) + " eyes");

        //task3
        char letter = 'A';
        //different methods
        System.out.println("\nIs letter \"" + letter + "\" a vowel? -> " + Letter.isVowelBy1stMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.isVowelBy2ndMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.isVowelBy3rdMethod(letter));
        System.out.println("Is letter \"" + letter + "\" a vowel? -> " + Letter.isVowelBy4thMethod(letter));

        //task4
        System.out.println("\nCurrent mood is " + MoodSensor.getMood());
        System.out.println("Cureent mood is " + MoodSensor.getMood());

        //task5
        int day = 31;
        int month = 12;
        int year = 2000;
        System.out.println("\n" + day + "." + month + "." + year + ": " + Calendar.identifyNextDay(day, month, year));
        day = 28;
        month = 2;
        System.out.println(day + "." + month + "." + year + ": " + Calendar.identifyNextDay(day, month, year));
    }
}
