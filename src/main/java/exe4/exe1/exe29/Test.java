package exe4.exe1.exe29;

public class Test {
    private static String s;
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        } catch( RuntimeException ex) {
            System.out.println("DONE");
        }
    }
}
