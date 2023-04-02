package session2.exe9;

public class Text {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("i am java");
        sb.delete(0,100);
        System.out.println(sb.length());
    }
}
