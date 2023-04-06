package exe4.exe1.exe45;

public class Test {
    private static void add(int i, int j){
        System.out.println("int version");
    }
    private static void add(Integer i, Integer j){
        System.out.println("int version");
    }

    public static void main(String[] args) {
        Test.add(12,38);
        Test.add(12,23);

    }

}
