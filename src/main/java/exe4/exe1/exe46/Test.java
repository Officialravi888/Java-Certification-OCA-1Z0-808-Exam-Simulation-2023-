package exe4.exe1.exe46;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int x = 10;
        switch(x) {
            case 10:
                a *= 2;
            case 20:
                a *= 3;
            case 30:
                a *= 4;
        }
        System.out.println(a);
    }
}