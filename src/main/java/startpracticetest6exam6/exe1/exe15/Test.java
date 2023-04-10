package startpracticetest6exam6.exe1.exe15;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base {
    Base() throws IOException {
        System.out.print(1);
    }
}

class Derived extends Base {
    Derived() throws Exception {
        System.out.print(2);
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        new Derived();
    }
}
