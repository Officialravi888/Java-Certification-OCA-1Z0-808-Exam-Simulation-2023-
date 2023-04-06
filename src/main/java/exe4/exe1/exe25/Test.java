package exe4.exe1.exe25;


//B.java


//C.java


//Test.java

public class Test {
    public static void main(String[] args) {
        A obj1 = new C();
        A obj2 = new B();
        C obj3 = (C)obj1;
        C obj4 = (C)obj2;
        obj3.print();
    }
}