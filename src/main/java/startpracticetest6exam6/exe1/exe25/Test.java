package startpracticetest6exam6.exe1.exe25;

public class Test {
    public static void main(String[] args) {
        System.out.println(new RuntimeException());
        System.out.println(new RuntimeException("Hello"));
        System.out.println((new RuntimeException(new RuntimeException("hello"))));
    }
}
