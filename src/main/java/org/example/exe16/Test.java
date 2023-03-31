package org.example.exe16;

public class Test {
    public static void main(String[] args) {
        String str="Java";
        StringBuilder stringBuilder=new StringBuilder("Java");
        System.out.println(str.equals(stringBuilder)+":"+stringBuilder.equals(str));
    }
}
