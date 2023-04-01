package org.example.exe39;

public class Message {
    static void main(String[]args){
        System.out.println("Welcome"+args[2]+"!");
    }
}
class Guest{
    public static void main(String[] args) {
        Message.main(args);
    }
}
