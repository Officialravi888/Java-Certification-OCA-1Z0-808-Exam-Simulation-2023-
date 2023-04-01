package org.example.exe38;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Test {
    public abstract void m1()throws IOException;
}
class Sub extends Test{
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}
class Main {
    public static void main(String[] args) {
        Test test=new Sub();
        try {
            test.m1();
            }catch (FileNotFoundException e){
        System.out.print("M");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("N");
    }
}
