package startpracticetest2exam2.exe40;

public class Test {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("A");
        }
    }
}
