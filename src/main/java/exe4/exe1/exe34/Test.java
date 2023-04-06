package exe4.exe1.exe34;

public class Test {
    public static void main(String [] args) {
        int a = 3;
        m(++a, a++);
        System.out.println(a);
    }

    private static void m(int i, int j) {
        i++;
        j--;
    }
}





