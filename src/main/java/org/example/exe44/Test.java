package org.example.exe44;

public class Test {
    public static void main(String[] args) {
        try {
            main(args);
        }catch (Exception ex){
            System.out.println("Catch-");
        }
        System.out.println("Out");
    }
}
