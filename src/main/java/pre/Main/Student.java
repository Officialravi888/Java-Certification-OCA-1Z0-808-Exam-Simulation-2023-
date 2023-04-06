package pre.Main;

public class Student {
    String name;
    int age;

    Student() {
        new Student("Ravi", 23);
    }

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Student student=new Student();
        System.out.println();
    }
}
