package startpracticetest4exam4.exe9;

public class Test {
    String a;
    int b;
    public void m1(String a){
        System.out.println(a);

    }
    public void m2(int b){
        System.out.println(b);
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.m2(12);
        test.m1("Tom");
    }
}
