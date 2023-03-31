package org.example.exe18;
class Message{
    String msg="Happy new year!";
    public void print(){
        System.out.println(msg);
    }
}
public class Test {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }
    public static void main(String[] args) {
        Message obj=new Message();
        obj.print();
        change(obj);
        obj.print();
    }
}
