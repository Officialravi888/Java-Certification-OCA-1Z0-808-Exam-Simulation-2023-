package org.example.exe24;
class Student{
    String name;
    int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
public class Test {
    public static void main(String[] args) {
    Student s = new Student("Jerry", 25);
    int mark = 25;
    review(s, mark);
     System.out.println(mark +"-"+s.mark);
}
    private static void review(Student stud, int mark) {
        mark = mark + 10;
        stud.mark += mark;
    }
}
