package startpracticetest2exam2.exe38;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super{
    public abstract void m1()throws Exception;

}
class sb extends Super{

    @Override
    public void m1() throws Exception {
        throw new FileNotFoundException();
    }
}
public class Test {
    public static void main(String[] args) {
        Super s =new sb();
        try {
            s.m1();
        } catch (IOException e) {
            System.out.print("A");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.print("C");
        }
    }

}
