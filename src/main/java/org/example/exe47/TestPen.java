package org.example.exe47;

class Pen {

}
public class TestPen {
    public static void main(String[] args) {
        new Pen(); //Line 1
        Pen p = new Pen(); // Line 2
        change(p); //Line 3
        System.out.println("About to end."); //Line 4
    }

    public static void change(Pen pen) { //Line 5
        pen = new Pen(); //Line 6
    }
}
