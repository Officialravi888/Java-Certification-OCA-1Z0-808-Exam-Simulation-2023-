package org.example.exe36;

public class Test {
    public static void main(String[] args) {
        byte var=100;

        switch(var){
            case 30:
                System.out.println("var is 100");
                break;
            case 127:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
                break;
        }
    }
}
