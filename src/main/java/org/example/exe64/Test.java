package org.example.exe64;

public class Test {
    static {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
//No print execption thrroww