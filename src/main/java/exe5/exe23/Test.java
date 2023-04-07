package exe5.exe23;

public class Test {
    private static void m(int i){
        System.out.println(1);
    }
    private static void m(int i1, int i2){
        System.out.println(2);
    }
    private static void m(int i1, int i2, int i3){
        System.out.println(3);
    }

    public static void main(String[] args) {
//        m(12);
        m(10,23);
        m(23,43,54);
        Test.m(12);
    }
}
