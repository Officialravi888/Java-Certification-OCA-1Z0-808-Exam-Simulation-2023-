package session2.exe25;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Test {
    public static void change(Message m) { //Line n5
        m.msg = "Happy Holidays!"; //Line n6
    }

    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}