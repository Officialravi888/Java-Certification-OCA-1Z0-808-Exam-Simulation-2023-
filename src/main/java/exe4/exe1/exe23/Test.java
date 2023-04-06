package exe4.exe1.exe23;

import java.io.IOException;

class ReadTheFile {
    static void print() { //Line 4
        ReadTheFile.print();// Line 5
    }
}

public class Test {
    public static void main(String[] args) { //Line 10
        ReadTheFile.print(); //Line 11
        //Line 12
    }
}
