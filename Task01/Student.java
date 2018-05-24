package task_01;

/**
 * Student class was made for testing references types with operators.
 *
 * 23 May 2018
 * @author Arthur Lyup
 */

public class Student {

    public String name;
    public int mark;

    public Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }

    public String toString(){
        return name + " : " + mark;
    }

}
