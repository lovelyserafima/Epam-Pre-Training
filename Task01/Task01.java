package task_01;

/**
 * Task01 is the class with the main method main(String[]).
 *
 * 23 May 2018
 * @author Arthur Lyup
 */

public class Task01 {
    public static void main(String[]args){
        //Testing primitive types
        DataTypesTester.testByte();
        DataTypesTester.testShort();
        DataTypesTester.testInt();
        DataTypesTester.testLong();
        DataTypesTester.testFloat();
        DataTypesTester.testDouble();
        DataTypesTester.testChar();
        DataTypesTester.testBoolean();

        //Testing reference types
        DataTypesTester.testString();
        DataTypesTester.testStudent();

    }
}
