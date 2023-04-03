package startpracticetest2exam2.exe46;

public class Test {
    public static void main(String[] args) {
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;
        System.out.println(l);
        System.out.println(i);
        System.out.println(f);
    }
}
