package startpracticetest6exam6.exe1.exe29;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base{
    Base()throws IOException {
        System.out.println(1);
    }
}
class Drived extends Base{
    Drived() throws IOException {
        super();
        System.out.println(2);
    }
}

public class Test {
    public static void main(String[] args) throws Exception{
        new Drived();
    }

}
