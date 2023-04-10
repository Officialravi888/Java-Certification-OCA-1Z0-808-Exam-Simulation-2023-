package startpracticetest6exam6.exe1.exe26;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(args[1].length());
        }catch (RuntimeException ex){
            System.out.println("One");
        }
        System.out.println("Three");
    }
}
