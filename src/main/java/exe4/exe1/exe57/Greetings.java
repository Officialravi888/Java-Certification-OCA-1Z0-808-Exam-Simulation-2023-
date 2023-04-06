package exe4.exe1.exe57;

public class Greetings {
    String msg = null;
    public Greetings() {
    }

    public Greetings(String str) {
      //  msg = str;
        str=msg;
    }

    public void display() {
        System.out.println(msg);
    }

    public static void main(String [] args) {
        Greetings g1 = new Greetings();
        Greetings g2 = new Greetings("Good Evening!");
        g1.display();
        g1.display();
    }
}
