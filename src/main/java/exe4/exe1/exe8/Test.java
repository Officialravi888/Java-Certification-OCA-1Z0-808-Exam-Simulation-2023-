package exe4.exe1.exe8;

public class Test {
    public static void main(String[] args) {
        extractInt(2.7);
        extractInt(2.2);
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}